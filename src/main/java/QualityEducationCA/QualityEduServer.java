/*
 * Created by Onyinye Gift Anueyiagu
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package QualityEducationCA;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;



/**
 *
 * @author Onyinye
 */
public class QualityEduServer {
    public static void main(String[] args) throws IOException,InterruptedException {
        int port = 50051;
        Server server = ServerBuilder.forPort(50051)
          .addService(new CareerPathServiceImpl())   // From CareerServiceImpl.java
            .addService(new SubjectServiceImpl())  // From SubjectServiceImpl.java
            .addService(new GradeReportServiceImpl())    // From GradeServiceImpl.java
            .build()
            .start();
        System.out.println("Server started on port 50051");
        
       JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

        // Register each service individually
        registerService(jmdns, "CareerPathService", port, "path=career");
        registerService(jmdns, "SubjectService", port, "path=subject");
        registerService(jmdns, "GradeReportService", port, "path=grade");

        // Keep server running
        server.awaitTermination();
    }

    private static void registerService(JmDNS jmdns, String serviceName, int port, String path) throws IOException {
        ServiceInfo serviceInfo = ServiceInfo.create("_grpc._tcp.local.", serviceName, port, path);
        jmdns.registerService(serviceInfo);
        System.out.println(serviceName + " registered via JmDNS on port " + port);
    }
 }


                
                
                
    


