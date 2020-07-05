package spring.cloud.demo.seata.order.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient("seata-storage-service")
public interface StorageService {

    @PostMapping("/storage/decrease")
    Map<String,Object> decrease(@RequestParam("productId") Long productId, @RequestParam("count")Integer count);
}
