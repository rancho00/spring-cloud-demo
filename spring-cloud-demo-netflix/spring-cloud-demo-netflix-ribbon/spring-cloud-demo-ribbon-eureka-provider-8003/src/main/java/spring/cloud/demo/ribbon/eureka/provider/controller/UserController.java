package spring.cloud.demo.ribbon.eureka.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.cloud.demo.ribbon.eureka.provider.entity.User;
import spring.cloud.demo.ribbon.eureka.provider.mapper.UserMapper;

import java.util.List;

@RequestMapping("/user")
@Controller
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping
    @ResponseBody
    public List<User> list(){
        return userMapper.list();
    }
}
