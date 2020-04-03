package spring.cloud.demo.ribbon.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//启动eureka服务端
@EnableEurekaServer
public class RibbonEurekaServer7001Application {

    public static void main(String[] args) {
        SpringApplication.run(RibbonEurekaServer7001Application.class,args);
    }
}
