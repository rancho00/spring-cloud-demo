package spring.cloud.demo.seata.storage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.demo.seata.storage.service.StorageService;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/storage")
@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;

    @PostMapping("/decrease")
    public Map<String,Object> decrease(Long productId,Integer count){
        Map<String,Object> resultMap=new HashMap<>();
        storageService.decrease(productId,count);
        resultMap.put("code",200);
        resultMap.put("message","");
        return resultMap;
    }
}
