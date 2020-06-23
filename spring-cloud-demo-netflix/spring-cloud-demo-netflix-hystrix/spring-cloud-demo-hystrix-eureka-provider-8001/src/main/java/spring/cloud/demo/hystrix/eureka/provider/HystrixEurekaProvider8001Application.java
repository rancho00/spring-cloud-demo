package spring.cloud.demo.hystrix.eureka.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableCircuitBreaker
@EnableEurekaClient
@SpringBootApplication
public class HystrixEurekaProvider8001Application {

    public static void main(String[] args) {
        SpringApplication.run(HystrixEurekaProvider8001Application.class,args);
    }
}
