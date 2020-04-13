package spring.cloud.demo.sentinel.nacos.feign.consume.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import spring.cloud.demo.sentinel.nacos.feign.consume.service.SysService;


@RequestMapping("/sys")
@Controller
public class SysController {

    @Autowired
    private SysService sysService;

    @GetMapping(value = "/getPort")
    @ResponseBody
    @SentinelResource(value = "getPort",fallback = "getPortFallback",exceptionsToIgnore = NullPointerException.class)
    public String getPort(Integer id){
        if(id==null){
            throw new NullPointerException("NullPointerException");
        }
        return sysService.getPort();
    }

    public String getPortFallback(Integer id){
        return "系统忙";
    }
}
