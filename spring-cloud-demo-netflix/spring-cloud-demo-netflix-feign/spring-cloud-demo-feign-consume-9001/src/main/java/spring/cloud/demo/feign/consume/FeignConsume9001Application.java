package spring.cloud.demo.feign.consume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class FeignConsume9001Application {

    public static void main(String[] args) {
        SpringApplication.run(FeignConsume9001Application.class,args);
    }
}
