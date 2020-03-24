package spring.cloud.demo.eureka.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@MapperScan(value = "spring.cloud.demo.eureka.provider.mapper")
public class EurekaProvider8001Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProvider8001Application.class,args);
    }
}
