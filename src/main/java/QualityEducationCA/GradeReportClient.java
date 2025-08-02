/*
 * Created by Onyinye Gift Anueyiagu
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package QualityEducationCA;
 import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import generated.grpc.GradeReport.GradeReportRequest;
import generated.grpc.GradeReport.GradeReportResponse;
import generated.grpc.GradeReport.AssessmentScore;
import generated.grpc.GradeReport.GradeReportServiceGrpc;

/**
 *
 * @author Onyinye
 */
public class GradeReportClient {
 
    private final GradeReportServiceGrpc.GradeReportServiceBlockingStub blockingStub;

    public GradeReportClient(ManagedChannel channel) {
        blockingStub = GradeReportServiceGrpc.newBlockingStub(channel);
    }

    // Unary call example
    public void getGradeReport(String studentName) {
        GradeReportRequest request = GradeReportRequest.newBuilder()
            .setStudentName(studentName)
            .build();

        GradeReportResponse response = blockingStub.getGradeReport(request);
        System.out.println("Grade for " + studentName + ": " + response.getGrade());
    }

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
            .usePlaintext()
            .build();

        GradeReportClient client = new GradeReportClient(channel);
        client.getGradeReport("Alice");

        channel.shutdown();
    }
}

