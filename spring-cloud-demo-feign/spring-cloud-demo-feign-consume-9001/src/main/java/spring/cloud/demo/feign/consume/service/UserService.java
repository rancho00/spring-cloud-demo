package spring.cloud.demo.feign.consume.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * feign->面向接口的负载均衡
 */
@FeignClient("USER-PROVIDER")
public interface UserService {

    @RequestMapping("/user/getPort")
    String getPort();
}
