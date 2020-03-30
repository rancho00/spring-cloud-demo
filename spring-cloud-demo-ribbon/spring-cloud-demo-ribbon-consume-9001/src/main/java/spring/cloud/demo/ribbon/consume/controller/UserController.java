package spring.cloud.demo.ribbon.consume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;


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
