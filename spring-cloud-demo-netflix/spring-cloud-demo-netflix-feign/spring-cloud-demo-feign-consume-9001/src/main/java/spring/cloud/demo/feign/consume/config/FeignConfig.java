package spring.cloud.demo.feign.consume.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLever(){
        return Logger.Level.FULL;
    }
}
