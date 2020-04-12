package spring.cloud.demo.sentinel.provider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/getPort")
    public String getPort() {
        return "8001";
    }

    @GetMapping("/getPort1")
    public String getPort1() {
        log.info(Thread.currentThread().getName()+"\t...getPort1");
        return "8002";
    }
}
