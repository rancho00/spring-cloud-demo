package spring.cloud.demo.hystrix.eureka.provider.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@RequestMapping("/sys")
@Controller
@DefaultProperties(defaultFallback = "sysFallback")
public class SysController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping(value = "/discovery")
    @ResponseBody
    public Object discovery(){
        List<String> services=discoveryClient.getServices();
        System.out.println(services);
        List<ServiceInstance> list=discoveryClient.getInstances("USER");
        list.forEach(serviceInstance -> {
            System.out.println(
                    serviceInstance.getServiceId()+"\t"+
                            serviceInstance.getHost()+"\t"+
                            serviceInstance.getPort()+"\t"+
                            serviceInstance.getUri()
            );
        });
        return this.discoveryClient;
    }

    @GetMapping(value = "/getPort")
    @HystrixCommand(fallbackMethod = "getPortHystrix", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000"), //超时3秒走fallback方法
            /**
             * 10秒内，有10次请求，百分之60都失败，则熔断
             */
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"), //开启熔断
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"), //10次请求触发
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"), //时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60") //错误百分比
    })
    @ResponseBody
    public String getPort(){
        throw new RuntimeException();
        //return "8001";
    }

    public String getPortHystrix(){
        return "getPortHystrix";
    }

    @GetMapping(value = "/getPort1")
    @ResponseBody
    public String getPort1(){
        throw new RuntimeException();
        //return "8001";
    }


    public String sysFallback(){
        return "000";
    }
}
