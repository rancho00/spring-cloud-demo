package nacos.provider8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosProvider8001Application {

    public static void main(String[] args) {
        SpringApplication.run(NacosProvider8001Application.class,args);
    }
}
