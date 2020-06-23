package spring.cloud.demo.hystrix.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HystrixEurekaServer7001Application {

    public static void main(String[] args) {
        SpringApplication.run(HystrixEurekaServer7001Application.class,args);
    }
}
