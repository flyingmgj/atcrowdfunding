package com.magee.atcrowdfunding.manager.dao;

import org.mybatis.spring.annotation.MapperScan;

import java.util.Map;

@MapperScan
public interface TestDao {
    public void insert(Map map);
}
