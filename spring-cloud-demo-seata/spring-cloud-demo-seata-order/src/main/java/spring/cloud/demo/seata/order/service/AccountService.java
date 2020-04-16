package spring.cloud.demo.seata.order.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.math.BigDecimal;
import java.util.Map;

@FeignClient("seata-account-service")
public interface AccountService {

    @PostMapping("/account/decrease")
    Map<String,Object> decrease(@Param("userId")Long userId, @Param("money")BigDecimal money);
}
