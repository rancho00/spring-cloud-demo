package spring.cloud.demo.gateway.eureka.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class GatewayEurekaProvider8001Application {

    public static void main(String[] args) {
        SpringApplication.run(GatewayEurekaProvider8001Application.class,args);
    }
}
