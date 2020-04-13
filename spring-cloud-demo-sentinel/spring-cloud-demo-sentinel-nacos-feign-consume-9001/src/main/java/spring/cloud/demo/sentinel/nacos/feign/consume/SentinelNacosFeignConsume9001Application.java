package spring.cloud.demo.sentinel.nacos.feign.consume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class SentinelNacosFeignConsume9001Application {

    public static void main(String[] args) {
        SpringApplication.run(SentinelNacosFeignConsume9001Application.class,args);
    }
}
