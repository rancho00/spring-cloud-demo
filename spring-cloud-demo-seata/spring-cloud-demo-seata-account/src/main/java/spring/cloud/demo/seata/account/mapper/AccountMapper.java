package spring.cloud.demo.seata.account.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.math.BigDecimal;

public interface AccountMapper {

    @Update("update t_account set money=#{money} where user_id=#{userId}")
    void decrease(@Param("userId")Long userId, @Param("money")BigDecimal money);
}
