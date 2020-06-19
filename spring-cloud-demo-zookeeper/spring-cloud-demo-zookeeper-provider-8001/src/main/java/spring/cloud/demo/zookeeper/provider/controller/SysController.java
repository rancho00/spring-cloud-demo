package spring.cloud.demo.zookeeper.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sys")
public class SysController {

    @RequestMapping("/getPort")
    public String getPort(){
        return "8001";
    }
}
