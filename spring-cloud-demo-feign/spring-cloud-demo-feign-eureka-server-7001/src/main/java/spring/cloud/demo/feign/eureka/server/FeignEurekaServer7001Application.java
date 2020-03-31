package spring.cloud.demo.feign.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FeignEurekaServer7001Application {

    public static void main(String[] args) {
        SpringApplication.run(FeignEurekaServer7001Application.class,args);
    }
}
