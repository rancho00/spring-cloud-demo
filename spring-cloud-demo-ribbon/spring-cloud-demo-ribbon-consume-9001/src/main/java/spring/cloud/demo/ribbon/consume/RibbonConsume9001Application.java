package spring.cloud.demo.ribbon.consume;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
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
