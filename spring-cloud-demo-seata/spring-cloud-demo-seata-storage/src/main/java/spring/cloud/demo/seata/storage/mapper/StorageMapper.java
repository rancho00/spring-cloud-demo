package spring.cloud.demo.seata.storage.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.math.BigDecimal;

public interface StorageMapper {

    @Update("update t_storage set count=#{count} where product_id=#{productId}")
    void decrease(@Param("productId") Long productId, @Param("count")Integer count);
}
