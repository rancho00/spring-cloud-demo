package spring.cloud.demo.hystrix.feign.consume.component;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import spring.cloud.demo.hystrix.feign.consume.service.UserService;

@Component
public class UserServiceFallbackFactory implements FallbackFactory<UserService> {
    @Override
    public UserService create(Throwable throwable) {
        return new UserService() {
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
