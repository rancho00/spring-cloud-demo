package spring.cloud.demo.zuul.feign.consume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class ZuulFeignConsume9001Application {

    public static void main(String[] args) {
        SpringApplication.run(ZuulFeignConsume9001Application.class,args);
    }

}
