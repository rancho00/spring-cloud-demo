package spring.cloud.demo.sentinel.nacos.feign.consume.service;

import org.springframework.stereotype.Component;

@Component
public class SysServiceFallback implements SysService{

    @Override
    public String getPort() {
        return "SysServiceFallback";
    }
}
