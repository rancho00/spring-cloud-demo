package spring.cloud.demo.zookeeper.consume.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;


@RestController
@RequestMapping("/sys")
@Slf4j
public class SysController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/getPort")
    public String getPort(){
        return restTemplate.getForObject("http://user-provider/sys/getPort",String.class);
    }

}
