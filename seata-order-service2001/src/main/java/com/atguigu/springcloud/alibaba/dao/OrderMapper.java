package com.atguigu.springcloud.alibaba.dao;

import com.atguigu.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Param;


public interface OrderMapper {
    //新建订单
    int insert(Order order);
    //修改订单状态，从0改为1
    int updateByPrimaryKeySelective(@Param("userId") Long userId,@Param("status") Integer status);

}