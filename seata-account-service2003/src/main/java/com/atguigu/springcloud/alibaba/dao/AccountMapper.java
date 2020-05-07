package com.atguigu.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

public interface AccountMapper {

    void decrease(@Param("userId") Long userId,@Param("money") BigDecimal money);
}