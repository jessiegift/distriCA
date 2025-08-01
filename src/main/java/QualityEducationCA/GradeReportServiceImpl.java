/*
 * Created by Onyinye Gift Anueyiagu
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package QualityEducationCA;
import generated.grpc.GradeReport.AssessmentScore;
import generated.grpc.GradeReport.GradeReportImpl;
import generated.grpc.GradeReport.GradeReportRequest;
import generated.grpc.GradeReport.GradeReportResponse;
import generated.grpc.GradeReport.GradeReportServiceGrpc;
import java.util.Map;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;



/**
 *
 * @author Onyinye
 */
public class GradeReportServiceImpl extends GradeReportServiceGrpc.GradeReportServiceImplBase {
        //unary RPC
    // Simple in-memory map of student names to grades
    private static final Map<String, String> studentGrades = Map.of(
        "Alice", "A",
        "Bob", "B+",
        "Charlie", "C",
        "David", "A-"
    );

    @Override
    public void getGradeReport(GradeReportRequest request, StreamObserver<GradeReportResponse> responseObserver) {
        String studentName = request.getStudentName();

        // Lookup grade from the map; if not found, return a default message
        String grade = studentGrades.getOrDefault(studentName, "Grade not found");

        // Build response with the actual grade
        GradeReportResponse response = GradeReportResponse.newBuilder()
            .setGrade(grade)
            .build();

        // Send response back to client
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    

    public StreamObserver<AssessmentScore> PredictFinalGrade(StreamObserver<GradeReportResponse> responseObserver) {
    // List to collect scores from the client stream
    ArrayList<Integer> scores = new ArrayList<>();

    return new StreamObserver<AssessmentScore>() {

        @Override
        public void onNext(AssessmentScore request) {
            System.out.println("Received score: " + request.getScore());
            scores.add(request.getScore());
        }

        @Override
        public void onError(Throwable t) {
            t.printStackTrace();
        }

        @Override
        public void onCompleted() {
            int sum = 0;
            int count = scores.size();

            for (int i = 0; i < count; i++) {
                sum = sum + scores.get(i);  // longhand addition
            }

            int average = 0;
            if (count > 0) {
                average = sum / count;  // integer division, no decimals
            }

            String finalGrade;
            if (average >= 90) {
                finalGrade = "A";
            } else if (average >= 80) {
                finalGrade = "B";
            } else if (average >= 70) {
                finalGrade = "C";
            } else if (average >= 60) {
                finalGrade = "D";
            } else {
                finalGrade = "F";
            }

            GradeReportResponse response = GradeReportResponse.newBuilder()
                                            .setGrade(finalGrade)
                                            .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    };
   }
}

    
    
    
     