package spring.cloud.demo.sentinel.nacos.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SentinelNacosProvider8001Application {

    public static void main(String[] args) {
        SpringApplication.run(SentinelNacosProvider8001Application.class,args);
    }
}
