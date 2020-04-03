package spring.cloud.demo.ribbon.consume.controller;

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

    @Autowired
    private LoadBalancerClient loadBalancer;

    @GetMapping("/byLoadBalancer")
    @ResponseBody
    public Object getUsersByLoadBalancerClient(){
        ServiceInstance instance = loadBalancer.choose("user-provider");
        URI storesUri = URI.create(String.format("https://%s:%s", instance.getHost(), instance.getPort()));
        return  restTemplate.getForObject(storesUri+"/user",Object.class);
    }

    @GetMapping
    @ResponseBody
    public Object getUsers(){
        return restTemplate.getForObject("http://USER-PROVIDER/user",Object.class);
    }

    @GetMapping("/discovery")
    @ResponseBody
    public Object discovery(){
        return restTemplate.getForObject("http://USER-PROVIDER/user/discovery",Object.class);
    }

    @GetMapping("/getPort")
    @ResponseBody
    public String getPort(){
        return restTemplate.getForObject("http://USER-PROVIDER/user/getPort",String.class);
    }
}
