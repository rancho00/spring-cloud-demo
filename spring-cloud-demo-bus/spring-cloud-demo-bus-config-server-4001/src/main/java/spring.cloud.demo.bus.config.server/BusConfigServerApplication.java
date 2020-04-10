package spring.cloud.demo.bus.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BusConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusConfigServerApplication.class,args);
    }
}
