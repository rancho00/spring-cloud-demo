package spring.cloud.demo.hystrix.feign.consume.component;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import spring.cloud.demo.hystrix.feign.consume.service.SysService;

@Component
public class SysServiceFallbackFactory implements FallbackFactory<SysService> {
    @Override
    public SysService create(Throwable throwable) {
        return new SysService() {
            @Override
            public String getPort() {
                return "getPort出错";
            }

            @Override
            public String getPort1() {
                return "getPort1出错";
            }
        };
    }
}
