package spring.cloud.demo.seata.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.demo.seata.account.service.AccountService;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RequestMapping("/account")
@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/decrease")
    public Map<String,Object> decrease(Long userId, BigDecimal money){
        Map<String,Object> resultMap=new HashMap<>();
        accountService.decrease(userId,money);
        resultMap.put("code",200);
        resultMap.put("message","");
        return resultMap;
    }
}
