package spring.cloud.demo.ribbon.consume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RibbonConsume9001Application {

    public static void main(String[] args) {
        SpringApplication.run(RibbonConsume9001Application.class,args);
    }

    @Bean(value = "restTemplate")
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
