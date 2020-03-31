package spring.cloud.demo.hystrix.eureka.provider.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.cloud.demo.hystrix.eureka.provider.entity.User;
import spring.cloud.demo.hystrix.eureka.provider.mapper.UserMapper;

import java.util.List;

@RequestMapping("/user")
@Controller
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping
    @ResponseBody
    public List<User> list(){
        return userMapper.list();
    }

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
    @HystrixCommand(fallbackMethod = "getPortHystrix")
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
}
