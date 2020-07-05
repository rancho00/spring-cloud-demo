package spring.cloud.demo.seata.account.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Account {

    private Long id;
    private Long userId;
    private BigDecimal total;
    private BigDecimal used;
    private BigDecimal residue;
}
