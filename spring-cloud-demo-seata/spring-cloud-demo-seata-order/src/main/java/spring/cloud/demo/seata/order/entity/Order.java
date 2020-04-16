package spring.cloud.demo.seata.order.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Order {

    private Long id;
    private Long userId;
    private Long productId;
    private Integer count;
    private BigDecimal money;
    private Integer status;
}
