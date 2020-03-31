package spring.cloud.demo.feign.eureka.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@MapperScan(value = "spring.cloud.demo.feign.eureka.provider.mapper")
public class FeignEurekaProvider8001Application {

    public static void main(String[] args) {
        SpringApplication.run(FeignEurekaProvider8001Application.class,args);
    }
}
