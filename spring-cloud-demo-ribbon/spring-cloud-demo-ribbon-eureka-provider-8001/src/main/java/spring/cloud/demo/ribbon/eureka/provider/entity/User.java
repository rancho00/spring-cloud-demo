package spring.cloud.demo.ribbon.eureka.provider.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    private Integer id;
    private String username;
    private Date createTime;
}
