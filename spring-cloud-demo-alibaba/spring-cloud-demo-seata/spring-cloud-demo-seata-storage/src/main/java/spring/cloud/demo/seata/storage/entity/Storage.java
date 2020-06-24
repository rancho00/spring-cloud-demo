package spring.cloud.demo.seata.storage.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Storage {

    private Long id;
    private Long productId;
    private Integer total;
    private Integer used;
    private Integer residue;
}
