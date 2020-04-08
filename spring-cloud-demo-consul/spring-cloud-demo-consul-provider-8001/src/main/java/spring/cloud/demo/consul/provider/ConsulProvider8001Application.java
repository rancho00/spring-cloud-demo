package spring.cloud.demo.consul.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ConsulProvider8001Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsulProvider8001Application.class,args);
    }
}
