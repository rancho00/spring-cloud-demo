package spring.cloud.demo.sentinel.provider.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.demo.sentinel.provider.handler.CustomHandler;

@RequestMapping("/sys")
@RestController
@Slf4j
public class SysController {

    @GetMapping("/getPort")
    public String getPort() {
        return "8001";
    }

    @GetMapping("/getPort1")
    public String getPort1() {
        log.info(Thread.currentThread().getName()+"\t...getPort1");
        return "8002";
    }

    @GetMapping("/getPort2")
    public String getPort2() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "8003";
    }

    @SentinelResource(value = "getHotPort",blockHandler = "deal_getHotPort")
    @GetMapping("/getHotPort")
    public  String getHotPort(String p1,String p2){
        return "getHotPort";
    }

    public String deal_getHotPort(String p1, String p2, BlockException exception){
        return "deal_getHotPort";
    }

    @SentinelResource(value = "getHotPort1",blockHandlerClass = CustomHandler.class,blockHandler = "handlerException2")
    @GetMapping("/getHotPort1")
    public  String getHotPort1(String p1,String p2){
        return "getHotPort1";
    }
}
