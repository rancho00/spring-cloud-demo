package spring.cloud.demo.feign.consume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.cloud.demo.feign.consume.service.SysService;


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
}
