package spring.cloud.demo.gateway.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GatewayEurekaServer7001Application {

    public static void main(String[] args) {
        SpringApplication.run(GatewayEurekaServer7001Application.class,args);
    }
}
