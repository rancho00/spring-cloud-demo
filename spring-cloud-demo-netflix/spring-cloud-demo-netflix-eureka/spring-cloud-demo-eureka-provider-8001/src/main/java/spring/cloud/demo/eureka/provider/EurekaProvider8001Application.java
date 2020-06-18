package spring.cloud.demo.eureka.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//启动eureka客户端
@EnableEurekaClient
@SpringBootApplication
public class EurekaProvider8001Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProvider8001Application.class,args);
    }
}
