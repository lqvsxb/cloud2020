package com.atguigu.springcloud.alibaba.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.atguigu.springcloud.alibaba.domain.Storage;
import com.atguigu.springcloud.alibaba.dao.StorageMapper;
import com.atguigu.springcloud.alibaba.service.StorageService;
@Service
public class StorageServiceImpl implements StorageService{

    @Resource
    private StorageMapper storageMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return storageMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Storage record) {
        return storageMapper.insert(record);
    }

    @Override
    public int insertSelective(Storage record) {
        return storageMapper.insertSelective(record);
    }

    @Override
    public Storage selectByPrimaryKey(Long id) {
        return storageMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Storage record) {
        return storageMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Storage record) {
        return storageMapper.updateByPrimaryKey(record);
    }

}
