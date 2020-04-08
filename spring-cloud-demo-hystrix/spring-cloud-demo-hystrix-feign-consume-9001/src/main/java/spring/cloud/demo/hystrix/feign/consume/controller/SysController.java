package spring.cloud.demo.hystrix.feign.consume.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import javafx.beans.DefaultProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.cloud.demo.hystrix.feign.consume.service.SysService;


@Controller
@RequestMapping("/sys")
public class SysController {

   @Autowired
   private SysService sysService;

    @GetMapping("/getPort")
    @ResponseBody
    public String getPort(){
        return sysService.getPort();
    }

    @GetMapping("/getPort1")
    @ResponseBody
    public String getPort1(){
        return sysService.getPort1();
    }

}
