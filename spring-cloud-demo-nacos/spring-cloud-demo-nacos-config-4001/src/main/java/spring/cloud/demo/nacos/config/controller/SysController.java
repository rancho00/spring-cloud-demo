package spring.cloud.demo.nacos.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RequestMapping("/sys")
@Controller
public class SysController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/getPort")
    @ResponseBody
    public String getPort(){
        return restTemplate.getForObject("http://nacos-sys-provider/sys/getPort",String.class);
    }
}
