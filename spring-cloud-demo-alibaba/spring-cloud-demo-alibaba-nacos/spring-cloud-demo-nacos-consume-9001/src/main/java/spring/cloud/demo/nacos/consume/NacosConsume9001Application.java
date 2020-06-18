package spring.cloud.demo.nacos.consume;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosConsume9001Application {

    public static void main(String[] args) {
        SpringApplication.run(NacosConsume9001Application.class,args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
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
