package spring.cloud.demo.ribbon.eureka.consume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;


@Controller
@RequestMapping("/sys")
public class SysController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getPort")
    @ResponseBody
    public String getPort(){
        return restTemplate.getForObject("http://USER-PROVIDER/sys/getPort",String.class);
    }
}
