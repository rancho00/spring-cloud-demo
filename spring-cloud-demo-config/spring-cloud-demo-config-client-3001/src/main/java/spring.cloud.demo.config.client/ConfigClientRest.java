package spring.cloud.demo.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientRest {

    @Value("${spring.application.name}")
    private String name;

    @Value("${server.port}")
    private  String port;

    @RequestMapping("/config")
    public String getConfig(){
        return "name："+name+"\t port："+port;
    }
}
