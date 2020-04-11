package spring.cloud.demo.nacos.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfig3001Application {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfig3001Application.class,args);
    }
}
