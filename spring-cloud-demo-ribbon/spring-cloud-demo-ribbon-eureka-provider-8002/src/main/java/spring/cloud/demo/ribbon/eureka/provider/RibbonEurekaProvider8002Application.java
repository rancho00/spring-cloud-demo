package spring.cloud.demo.ribbon.eureka.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@MapperScan(value = "spring.cloud.demo.ribbon.eureka.provider.mapper")
public class RibbonEurekaProvider8002Application {

    public static void main(String[] args) {
        SpringApplication.run(RibbonEurekaProvider8002Application.class,args);
    }
}
