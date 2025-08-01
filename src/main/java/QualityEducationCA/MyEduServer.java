/*
 * Created by Onyinye Gift Anueyiagu
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package QualityEducationCA;
import java.io.IOException;

/**
 *
 * @author admin
 */
public class MyEduServer {

    public static void main(String[] args)throws IOException,InterruptedException {
        Server server =ServerBuilder.
    }
}
 static class GreeterImpl extends GreeterGrpc.GreeterImplBase {

  @Override
  public void sayHello(HelloRequest req, StreamObserver<HelloReply> responseObserver) {
    HelloReply reply = HelloReply.newBuilder().setMessage("Hello " + req.getName()).build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }
}
