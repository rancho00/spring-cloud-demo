package spring.cloud.demo.hystrix.eureka.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@MapperScan(value = "spring.cloud.demo.hystrix.eureka.provider.mapper")
public class HystrixEurekaProvider8001Application {

    public static void main(String[] args) {
        SpringApplication.run(HystrixEurekaProvider8001Application.class,args);
    }
}
