package spring.cloud.demo.zuul.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ZuulEurekaServer7001Application {

    public static void main(String[] args) {
        SpringApplication.run(ZuulEurekaServer7001Application.class,args);
    }
}
