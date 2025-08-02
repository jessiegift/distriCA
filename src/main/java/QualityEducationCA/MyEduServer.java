package QualityEducationCA;

import generated.grpc.Subject.SubjectFeedback;
import generated.grpc.Subject.SubjectPerformance;
import generated.grpc.Subject.SubjectServiceGrpc;
import generated.grpc.GradeReport.GradeReportRequest;
import generated.grpc.GradeReport.GradeReportResponse;
import generated.grpc.GradeReport.AssessmentScore;
import generated.grpc.GradeReport.GradeReportServiceGrpc;
import generated.grpc.CareerPath.CareerPathRequest;
import generated.grpc.CareerPath.CareerPathResponse;
import generated.grpc.CareerPath.SubjectGrade;
import generated.grpc.CareerPath.CareerPathServiceGrpc;
import io.grpc.*;
import io.grpc.stub.StreamObserver;

import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class MyEduServer {
    private final ManagedChannel channel;
    private final SubjectServiceGrpc.SubjectServiceStub subjectAsyncStub;
    private final GradeReportServiceGrpc.GradeReportServiceBlockingStub gradeBlockingStub;
    private final GradeReportServiceGrpc.GradeReportServiceStub gradeAsyncStub;
    private final CareerPathServiceGrpc.CareerPathServiceBlockingStub careerBlockingStub;

    public MyEduServer(String host, int port) {
        this.channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        this.subjectAsyncStub = SubjectServiceGrpc.newStub(channel);
        this.gradeBlockingStub = GradeReportServiceGrpc.newBlockingStub(channel);
        this.gradeAsyncStub = GradeReportServiceGrpc.newStub(channel);
        this.careerBlockingStub = CareerPathServiceGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void monitorSubjectPerformance() throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<SubjectPerformance> requestObserver = subjectAsyncStub.monitorSubjectPerformance(
                new StreamObserver<SubjectFeedback>() {
                    @Override
                    public void onNext(SubjectFeedback feedback) {
                        System.out.println("Feedback: " + feedback);
                    }

                    @Override
                    public void onError(Throwable t) {
                        System.err.println("Error: " + t);
                        latch.countDown();
                    }

                    @Override
                    public void onCompleted() {
                        System.out.println("Subject feedback stream completed.");
                        latch.countDown();
                    }
                });

        requestObserver.onNext(SubjectPerformance.newBuilder()
                .setStudentName("John Doe")
                .setSubject("Math")
                .setQuizName("Algebra Quiz")
                .setSubjectScore(85)
                .build());

        requestObserver.onNext(SubjectPerformance.newBuilder()
                .setStudentName("John Doe")
                .setSubject("Science")
                .setQuizName("Biology Quiz")
                .setSubjectScore(90)
                .build());

        requestObserver.onCompleted();
        latch.await();
    }

    public void getGradeReport() {
        GradeReportRequest request = GradeReportRequest.newBuilder()
                .setStudentName("John Doe")
                .build();

        GradeReportResponse response = gradeBlockingStub.getGradeReport(request);
        System.out.println("Grade Report: " + response.getGrade());
    }

    public void predictFinalGrade() throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<AssessmentScore> requestObserver = gradeAsyncStub.predictFinalGrade(
                new StreamObserver<GradeReportResponse>() {
                    @Override
                    public void onNext(GradeReportResponse value) {
                        System.out.println("Predicted Final Grade: " + value.getGrade());
                    }

                    @Override
                    public void onError(Throwable t) {
                        t.printStackTrace();
                        latch.countDown();
                    }

                    @Override
                    public void onCompleted() {
                        System.out.println("Final grade prediction completed.");
                        latch.countDown();
                    }
                });

        requestObserver.onNext(AssessmentScore.newBuilder().setScore(80).build());
        requestObserver.onNext(AssessmentScore.newBuilder().setScore(85).build());
        requestObserver.onNext(AssessmentScore.newBuilder().setScore(90).build());

        requestObserver.onCompleted();
        latch.await();
    }

    public void suggestCareerPaths() {
        CareerPathRequest request = CareerPathRequest.newBuilder()
                .setStudentName("John Doe")
                .addGrades(SubjectGrade.newBuilder().setSubject("Math").setScore(92).build())
                .addGrades(SubjectGrade.newBuilder().setSubject("Biology").setScore(87).build())
                .build();

        Iterator<CareerPathResponse> responses = careerBlockingStub.suggestCareerPaths(request);
        while (responses.hasNext()) {
            System.out.println("Suggested Career Path: " + responses.next().getCareerPath());
        }
    }

    public static void main(String[] args) throws Exception {
       MyEduServer client = new MyEduServer("localhost", 50051);
        try {
            client.monitorSubjectPerformance();
            client.getGradeReport();
            client.predictFinalGrade();
            client.suggestCareerPaths();
        } finally {
            client.shutdown();
        }
    }
}
