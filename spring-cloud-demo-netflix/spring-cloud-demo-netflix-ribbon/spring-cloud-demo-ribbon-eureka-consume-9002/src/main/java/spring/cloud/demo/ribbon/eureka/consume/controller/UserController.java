package spring.cloud.demo.ribbon.eureka.consume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.net.URI;


@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    @ResponseBody
    public Object getUsers(){
        return restTemplate.getForObject("http://USER-PROVIDER/user",Object.class);
    }
}
