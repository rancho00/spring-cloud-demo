package spring.cloud.demo.zuul.eureka.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
@MapperScan(value = "spring.cloud.demo.zuul.eureka.provider.mapper")
public class ZuulEurekaProvider8001Application {

    public static void main(String[] args) {
        SpringApplication.run(ZuulEurekaProvider8001Application.class,args);
    }
}
