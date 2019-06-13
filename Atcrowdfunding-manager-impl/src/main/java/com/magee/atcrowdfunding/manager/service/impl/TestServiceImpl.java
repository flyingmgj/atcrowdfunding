package com.magee.atcrowdfunding.manager.service.impl;

import com.magee.atcrowdfunding.manager.dao.TestDao;
import com.magee.atcrowdfunding.manager.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.HashMap;
import java.util.Map;

@Service
@SuppressWarnings("all")
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDao testDao;

    @Override
    public void insert() {
        Map map = new HashMap<>();
        map.put("name","zhangsan");
        testDao.insert(map);
    }
}
