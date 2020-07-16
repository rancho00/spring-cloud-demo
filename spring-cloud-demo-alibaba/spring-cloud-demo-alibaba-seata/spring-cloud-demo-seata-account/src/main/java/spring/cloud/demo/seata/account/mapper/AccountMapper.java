package spring.cloud.demo.seata.account.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.math.BigDecimal;

@Mapper
public interface AccountMapper {

    @Update("update t_account set used=#{used},residue=total-#{used} where user_id=#{userId}")
    void decrease(@Param("userId")Long userId, @Param("used")BigDecimal used);
}
