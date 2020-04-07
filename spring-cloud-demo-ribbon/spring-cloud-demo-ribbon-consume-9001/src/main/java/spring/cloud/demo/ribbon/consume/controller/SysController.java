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
@RequestMapping("/sys")
public class SysController {


    @Autowired
    private RestTemplate restTemplate;


    @Autowired
    private LoadBalancerClient loadBalancer;


    @GetMapping("/getPort")
    @ResponseBody
    public String getPort(){
        ServiceInstance instance = loadBalancer.choose("user-provider");
        URI storesUri = URI.create(String.format("http://%s:%s", instance.getHost(), instance.getPort()));
        return  restTemplate.getForObject(storesUri+"/sys/getPort",String.class);
    }
}
