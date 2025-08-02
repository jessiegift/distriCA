package QualityEducationCA;



import generated.grpc.CareerPath.CareerPathRequest;
import generated.grpc.CareerPath.CareerPathResponse;
import generated.grpc.CareerPath.SubjectGrade;
import generated.grpc.CareerPath.CareerPathServiceGrpc;
import io.grpc.*;
import io.grpc.stub.StreamObserver;

import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CareerClient {
    private final CareerPathServiceGrpc.CareerPathServiceStub asyncStub;
   
    public CareerClient (ManagedChannel channel) {
        asyncStub = CareerPathServiceGrpc.newStub(channel);
    }

    public void suggestCareerPaths(String studentName, java.util.List<SubjectGrade> grades) throws InterruptedException {
        CareerPathRequest request = CareerPathRequest.newBuilder()
            .setStudentName(studentName)
            .addAllGrades(grades)
            .build();

        final Object waitLock = new Object();

        StreamObserver<CareerPathResponse> responseObserver = new StreamObserver<CareerPathResponse>() {
            @Override
            public void onNext(CareerPathResponse response) {
                System.out.println("Suggested career path: " + response.getCareerPath());
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
                synchronized(waitLock) {
                    waitLock.notify();
                }
            }

            @Override
            public void onCompleted() {
                System.out.println("Finished receiving career path suggestions.");
                synchronized(waitLock) {
                    waitLock.notify();
                }
            }
        };

        asyncStub.suggestCareerPaths(request, responseObserver);

        // Wait for the stream to finish
        synchronized(waitLock) {
            waitLock.wait();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
            .usePlaintext()
            .build();

        CareerClient client = new CareerClient(channel);

        // Example grades
        SubjectGrade mathGrade = SubjectGrade.newBuilder().setSubject("Mathematics").setScore(85).build();
        SubjectGrade bioGrade = SubjectGrade.newBuilder().setSubject("Biology").setScore(75).build();

        client.suggestCareerPaths("John Doe", java.util.List.of(mathGrade, bioGrade));

        channel.shutdownNow();
    }
}
