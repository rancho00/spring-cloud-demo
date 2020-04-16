package spring.cloud.demo.seata.order.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.cloud.demo.seata.order.entity.Order;
import spring.cloud.demo.seata.order.mapper.OrderMapper;
import spring.cloud.demo.seata.order.service.AccountService;
import spring.cloud.demo.seata.order.service.OrderService;
import spring.cloud.demo.seata.order.service.StorageService;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private StorageService storageService;

    @Autowired
    private AccountService accountService;

    @Override
    public void create(Order order) {
        log.info("-------->开始创建订单");
        orderMapper.create(order);
        log.info("-------->订单微服务开始调用库存微服务，更新库存");
        storageService.decrease(order.getProductId(),order.getCount());
        log.info("-------->订单微服务开始调用用户微服务，更新余额");
        accountService.decrease(order.getUserId(),order.getMoney());
        log.info("-------->修改订单状态");
        orderMapper.updateStatus(order.getUserId(),0);
        log.info("-------->创建订单成功");
    }
}
