package spring.cloud.demo.nacos.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/sys")
@RestController
@RefreshScope //动态刷新
public class SysController {

    @Value("${config.info}")
    private  String info;

    @RequestMapping("/config")
    public String getConfig(){
        return "info："+info;
    }
}
