/*
 * Created by Onyinye Gift Anueyiagu
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package QualityEducationCA;
import generated.grpc.CareerPath.CareerPathImpl;
import generated.grpc.CareerPath.CareerPathServiceGrpc.CareerPathServiceImplBase;
import generated.grpc.CareerPath.CareerPathRequest;
import generated.grpc.CareerPath.CareerPathResponse;
import generated.grpc.CareerPath.CareerPathServiceGrpc;
import generated.grpc.CareerPath.SubjectGrade;
import java.util.List;
import java.util.logging.Logger;
import io.grpc.stub.StreamObserver;


/**
 *
 * @author Onyinye
 */
public class CareerPathServiceImpl extends CareerPathServiceImplBase { 
     private static final Logger logger = Logger.getLogger(CareerPathServiceImpl.class.getName());
     @Override
     public void suggestCareerPaths(CareerPathRequest request, StreamObserver<CareerPathResponse> responseObserver) {
       
        logger.info("Received request for student: " + request.getStudentName());

        List<SubjectGrade> grades = request.getGradesList();

        for (SubjectGrade grade : grades) {
            String subject = grade.getSubject();
            double score = grade.getScore();

            String careerSuggestion;

            if (subject.equalsIgnoreCase("Mathematics") && score >= 80) {
                careerSuggestion = "Engineer";
            } else if (subject.equalsIgnoreCase("Biology") && score >= 80) {
                careerSuggestion = "Doctor";
            } else if (subject.equalsIgnoreCase("Literature") && score >= 80) {
                careerSuggestion = "Writer";
            } else {
                careerSuggestion = "part-time worker";
            }
            
            

            CareerPathResponse careerresponse = CareerPathResponse.newBuilder()
                    .setCareerPath(careerSuggestion)
                    .build();

            responseObserver.onNext(careerresponse); // stream one career suggestion
        }

        responseObserver.onCompleted(); // finish streaming
    }
}
    


