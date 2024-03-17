package com.template.project.test.impl;

import com.template.project.test.TestDao;
import com.template.project.test.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: kevin-senzou
 **/
@Service
@Slf4j
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;


    @Override
    public void testService() {
        log.info("enter TestServiceImpl --> testService() method...");
        testDao.testDao();;
    }
}
