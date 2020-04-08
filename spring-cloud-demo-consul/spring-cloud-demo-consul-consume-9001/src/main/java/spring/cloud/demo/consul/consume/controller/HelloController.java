package spring.cloud.demo.consul.consume.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/hello")
@Slf4j
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/sayHello")
    public String sayHello(){
        return restTemplate.getForObject("http://user-provider/hello/sayHello",String.class);
    }

}
