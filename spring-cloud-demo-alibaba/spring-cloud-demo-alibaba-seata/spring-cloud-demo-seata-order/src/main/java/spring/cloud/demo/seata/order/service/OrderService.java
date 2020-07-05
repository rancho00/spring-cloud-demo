package spring.cloud.demo.seata.order.service;

import spring.cloud.demo.seata.order.entity.Order;

public interface OrderService {

    void create(Order order);
}
