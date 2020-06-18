package spring.cloud.demo.ribbon.eureka.provider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping("/sys")
@Controller
public class SysController {

    @GetMapping(value = "/getPort")
    @ResponseBody
    public String getPort(){
        return "8002";
    }
}
