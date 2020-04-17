package spring.cloud.demo.seata.order.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.Map;

@FeignClient("seata-account-service")
public interface AccountService {

    @PostMapping("/account/decrease")
    Map<String,Object> decrease(@RequestParam("userId")Long userId, @RequestParam("money")BigDecimal money);
}
