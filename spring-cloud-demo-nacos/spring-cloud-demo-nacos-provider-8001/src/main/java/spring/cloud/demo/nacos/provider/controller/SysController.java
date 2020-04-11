package spring.cloud.demo.nacos.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@RequestMapping("/sys")
@Controller
public class SysController {

    @GetMapping(value = "/getPort")
    @ResponseBody
    public String getPort(){
        return "8001";
    }
}
