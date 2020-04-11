package spring.cloud.demo.nacos.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosProvider8002Application {

    public static void main(String[] args) {
        SpringApplication.run(NacosProvider8002Application.class,args);
    }
}
