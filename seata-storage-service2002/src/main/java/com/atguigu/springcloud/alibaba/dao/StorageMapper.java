package com.atguigu.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Param;

public interface StorageMapper {

    //扣减库存
    int decrease(@Param("productId") Long productId, @Param("count") Integer count);

}