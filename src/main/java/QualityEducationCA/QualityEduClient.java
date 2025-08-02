/*
 * Created by Onyinye Gift Anueyiagu
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

    package QualityEducationCA;
    import io.grpc.ManagedChannel;
    import io.grpc.ManagedChannelBuilder;
    import io.grpc.StatusRuntimeException;
    import io.grpc.stub.StreamObserver;
    import io.grpc.Context;
    import io.grpc.Context.CancellableContext;
    import java.util.concurrent.TimeUnit;
    import generated.grpc.Subject.SubjectFeedback;
    import generated.grpc.Subject.SubjectPerformance;
    import generated.grpc.Subject.SubjectImpl;
    import generated.grpc.Subject.SubjectServiceGrpc;

/**
 *
 * @author Onyinye
 */
public class QualityEduClient {
    public static void main(String[] args) throws InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        SubjectServiceGrpc.SubjectServiceStub asyncStub = SubjectServiceGrpc.newStub(channel);

        StreamObserver<SubjectPerformance> requestObserver = asyncStub.monitorSubjectPerformance(
            new StreamObserver<SubjectFeedback>() {
                @Override
                public void onNext(SubjectFeedback feedback) {
                    System.out.println("Feedback received:");
                    System.out.println("Progress: " + feedback.getProgressTracking());
                    System.out.println("Resources: " + feedback.getResourceRecommendation());
                    System.out.println("Tips: " + feedback.getPersonalizedTips());
                    System.out.println("Advisory: " + feedback.getAdvisory());
                }

                @Override
                public void onError(Throwable t) {
                    System.err.println("Error from server: " + t);
                }

                @Override
                public void onCompleted() {
                    System.out.println("Server finished sending feedback.");
                }
            });

        // Send multiple SubjectPerformance messages asynchronously
        requestObserver.onNext(SubjectPerformance.newBuilder()
                .setStudentName("John Doe")
                .setSubject("Math")
                .setQuizName("Quiz 1")
                .setSubjectScore(85)
                .build());

        requestObserver.onNext(SubjectPerformance.newBuilder()
                .setStudentName("John Doe")
                .setSubject("Science")
                .setQuizName("Quiz 1")
                .setSubjectScore(90)
                .build());

        // Signal that client has finished sending
        requestObserver.onCompleted();

        // Wait for some time to receive server responses
        Thread.sleep(5000);

        channel.shutdownNow();
    }
}