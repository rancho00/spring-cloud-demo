package spring.cloud.demo.seata.order.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import spring.cloud.demo.seata.order.entity.Order;

@Mapper
public interface OrderMapper {

    @Insert("insert into t_order (user_id,product_id,count,money,status) values (#{userId},#{productId},#{count},#{money},0)")
    void create(Order order);

    @Update("update t_order set status=1 where user_id=#{userId} and status=#{status}")
    void updateStatus(@Param("userId")Long userId,@Param("status")Integer status);
}
