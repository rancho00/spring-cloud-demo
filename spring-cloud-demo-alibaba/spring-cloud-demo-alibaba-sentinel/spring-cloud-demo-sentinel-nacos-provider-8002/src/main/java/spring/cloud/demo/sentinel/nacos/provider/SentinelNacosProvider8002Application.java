package spring.cloud.demo.sentinel.nacos.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SentinelNacosProvider8002Application {

    public static void main(String[] args) {
        SpringApplication.run(SentinelNacosProvider8002Application.class,args);
    }
}
