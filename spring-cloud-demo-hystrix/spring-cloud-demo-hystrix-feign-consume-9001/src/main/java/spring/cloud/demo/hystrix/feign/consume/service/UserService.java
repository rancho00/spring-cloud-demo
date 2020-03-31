package spring.cloud.demo.hystrix.feign.consume.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.cloud.demo.hystrix.feign.consume.component.UserServiceFallbackFactory;

/**
 * feign->面向接口的负载均衡
 */
@FeignClient(value = "USER-PROVIDER",fallbackFactory = UserServiceFallbackFactory.class)
public interface UserService {

    @RequestMapping("/user/getPort")
    String getPort();

    @RequestMapping("/user/getPort1")
    String getPort1();
}
