package spring.cloud.demo.hystrix.feign.consume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class HystrixFeignConsume9001Application {

    public static void main(String[] args) {
        SpringApplication.run(HystrixFeignConsume9001Application.class,args);
    }

}
