package com.atguigu.springcloud.alibaba.service;

import com.atguigu.springcloud.alibaba.domain.Storage;
public interface StorageService{


    int deleteByPrimaryKey(Long id);

    int insert(Storage record);

    int insertSelective(Storage record);

    Storage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Storage record);

    int updateByPrimaryKey(Storage record);

}
