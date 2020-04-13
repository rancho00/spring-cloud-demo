package spring.cloud.demo.sentinel.nacos.ribbon.consume.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;


@RequestMapping("/sys")
@Controller
public class SysController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/getPort")
    @ResponseBody
    @SentinelResource(value = "getPort",fallback = "getPortFallback",exceptionsToIgnore = NullPointerException.class)
    public String getPort(Integer id){
        if(id==null){
            throw new NullPointerException("NullPointerException");
        }
        return restTemplate.getForObject("http://nacos-sys-provider/sys/getPort",String.class);
    }

    public String getPortFallback(Integer id){
        return "系统忙";
    }
}
