package spring.cloud.demo.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/sys")
@RestController
public class SysController {

    @Value("${spring.application.name}")
    private String name;

    @Value("${server.port}")
    private  String port;

    @RequestMapping("/config")
    public String getConfig(){
        return "name："+name+"\t port："+port;
    }
}
