package spring.cloud.demo.zuul.feign.consume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.cloud.demo.zuul.feign.consume.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {

   @Autowired
   private UserService userService;

    @GetMapping("/getPort")
    @ResponseBody
    public String getPort(){
        return userService.getPort();
    }

    @GetMapping("/getPort1")
    @ResponseBody
    public String getPort1(){
        return userService.getPort1();
    }
}
