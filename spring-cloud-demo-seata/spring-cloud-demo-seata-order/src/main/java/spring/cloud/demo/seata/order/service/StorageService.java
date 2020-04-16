package spring.cloud.demo.seata.order.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@FeignClient("seata-storage-service")
public interface StorageService {

    @PostMapping("/storage/decrease")
    Map<String,Object> decrease(@Param("productId") Long productId, @Param("count")Integer count);
}
