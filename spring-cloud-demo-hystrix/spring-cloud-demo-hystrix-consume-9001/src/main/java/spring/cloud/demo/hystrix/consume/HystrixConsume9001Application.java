package spring.cloud.demo.hystrix.consume;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
public class HystrixConsume9001Application {

    public static void main(String[] args) {
        SpringApplication.run(HystrixConsume9001Application.class,args);
    }

    @Bean(value = "restTemplate")
    /**
     * 负载均衡->默认为轮询
     */
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    /**
     * 定义负载均衡为随机
     * @return
     */
    @Bean
    public IRule randomRule(){
        return new RandomRule();
    }
}
