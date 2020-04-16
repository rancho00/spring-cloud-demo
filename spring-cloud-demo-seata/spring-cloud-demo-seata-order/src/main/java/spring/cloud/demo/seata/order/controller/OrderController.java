package spring.cloud.demo.seata.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.cloud.demo.seata.order.entity.Order;
import spring.cloud.demo.seata.order.mapper.OrderMapper;
import spring.cloud.demo.seata.order.service.OrderService;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/order")
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public Map<String,Object> create(Order order){
        Map<String,Object> resultMap=new HashMap<>();
        orderService.create(order);
        resultMap.put("code",200);
        resultMap.put("message","创建订单成功");
        return resultMap;
    }
}
