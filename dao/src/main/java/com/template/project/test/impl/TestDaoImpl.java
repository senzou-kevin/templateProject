package com.template.project.test.impl;

import com.template.project.test.TestDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

/**
 * @author: kevin-senzou
 **/
@Slf4j
@Repository
public class TestDaoImpl implements TestDao {
    @Override
    public void testDao() {
        log.info("enter TestDaoImpl --> testDao() method...");
    }
}
