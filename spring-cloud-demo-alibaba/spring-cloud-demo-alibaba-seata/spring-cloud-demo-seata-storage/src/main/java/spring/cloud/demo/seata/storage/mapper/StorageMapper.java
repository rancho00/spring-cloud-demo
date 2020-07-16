package spring.cloud.demo.seata.storage.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.math.BigDecimal;

@Mapper
public interface StorageMapper {

    @Update("update t_storage set used=#{used},residue=total-#{used} where product_id=#{productId}")
    void decrease(@Param("productId") Long productId, @Param("used")Integer used);
}
