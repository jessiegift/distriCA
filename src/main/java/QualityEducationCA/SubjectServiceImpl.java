/*
 * Created by Onyinye Gift Anueyiagu
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package QualityEducationCA;
import generated.grpc.Subject.SubjectFeedback;
import generated.grpc.Subject.SubjectPerformance;
import generated.grpc.Subject.SubjectImpl;
import generated.grpc.Subject.SubjectServiceGrpc;
import java.util.logging.Logger;
import io.grpc.stub.StreamObserver;


/**
 *
 * @author Onyinye
 */
public class SubjectServiceImpl extends SubjectServiceGrpc.SubjectServiceImplBase  {
    private static final Logger logger = Logger.getLogger(SubjectServiceImpl.class.getName());
    @Override
    public StreamObserver<SubjectPerformance> monitorSubjectPerformance(StreamObserver<SubjectFeedback> responseObserver) {
        return new StreamObserver<SubjectPerformance>() {
            
            @Override
            public void onNext(SubjectPerformance request) {
                String studentName = request.getStudentName();
                String subject = request.getSubject();
                int score = request.getSubjectScore();
                String quizName = request.getQuizName();

               logger.info("Received quiz: " + quizName + " for subject: " + subject + " with score: " + score + " from student: " + studentName);

                String progress;
                String recommendation;
                String tips;
                String advisory;

                if (score >= 90) {
                    progress = "Excellent";
                    recommendation = "Keep up the great work!";
                    tips = "Continue solving advanced questions.";
                    advisory = "No additional action needed.";
                } else if (score >= 70) {
                    progress = "Good";
                    recommendation = "Review related topics.";
                    tips = "Watch tutorial videos on weak areas.";
                    advisory = "Consider a short refresher.";
                } else {
                    progress = "Needs Improvement";
                    recommendation = "Use practice resources.";
                    tips = "Focus on foundational concepts.";
                    advisory = "Schedule time with a tutor.";
                }

                SubjectFeedback feedback = SubjectFeedback.newBuilder()
                        .setProgressTracking(progress)
                        .setResourceRecommendation(recommendation)
                        .setPersonalizedTips(tips)
                        .setAdvisory(advisory)
                        .build();

                responseObserver.onNext(feedback);
            }

            @Override
            public void onError(Throwable t) {
               logger.severe("Error in SubjectPerformance stream: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                  logger.info("SubjectPerformance stream completed.");
                responseObserver.onCompleted();
            }
        };
    }
}

