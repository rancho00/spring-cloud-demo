package spring.cloud.demo.hystrix.feign.consume.component;

import org.springframework.stereotype.Component;
import spring.cloud.demo.hystrix.feign.consume.service.SysService;

@Component
public class SysFallbackService implements SysService {

    @Override
    public String getPort() {
        return "getPort出错";
    }

    @Override
    public String getPort1() {
        return "getPort1出错";
    }
}
