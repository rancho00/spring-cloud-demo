package spring.cloud.demo.hystrix.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class HystrixDashboard6001Application {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboard6001Application.class);
    }
}
