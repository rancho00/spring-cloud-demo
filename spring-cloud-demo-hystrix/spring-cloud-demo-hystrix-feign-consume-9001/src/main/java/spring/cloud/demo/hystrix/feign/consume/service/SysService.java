package spring.cloud.demo.hystrix.feign.consume.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.cloud.demo.hystrix.feign.consume.component.SysFallbackService;
import spring.cloud.demo.hystrix.feign.consume.component.SysServiceFallbackFactory;

/**
 * feign->面向接口的负载均衡
 */
//@FeignClient(value = "USER-PROVIDER",fallbackFactory = SysServiceFallbackFactory.class)
@FeignClient(value = "USER-PROVIDER",fallback = SysFallbackService.class)
public interface SysService {

    @RequestMapping("/sys/getPort")
    String getPort();

    @RequestMapping("/sys/getPort1")
    String getPort1();
}
