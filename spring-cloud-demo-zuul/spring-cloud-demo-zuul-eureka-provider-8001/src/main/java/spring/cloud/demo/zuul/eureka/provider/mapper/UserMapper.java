package spring.cloud.demo.zuul.eureka.provider.mapper;

import org.apache.ibatis.annotations.Select;
import spring.cloud.demo.zuul.eureka.provider.entity.User;

import java.util.List;

public interface UserMapper {

    @Select("select * from user")
    List<User> list();
}
