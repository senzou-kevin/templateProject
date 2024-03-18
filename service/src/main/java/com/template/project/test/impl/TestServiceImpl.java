package com.template.project.test.impl;

import com.template.project.dataobject.TestTableDO;
import com.template.project.mapper.testtable.TestTableMapper;
import com.template.project.test.TestService;
import com.template.project.test.convertor.TestConvertor;
import dto.test.TestTableDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: kevin-senzou
 **/
@Service
@Slf4j
public class TestServiceImpl implements TestService {

    @Autowired
    private TestTableMapper testTableMapper;


    @Override
    public List<TestTableDTO> findTestTables() {
        List<TestTableDO> testTableDOS = testTableMapper.selectList(null);
        return TestConvertor.INSTANCE.toTestTableDTOList(testTableDOS);
    }

    @Override
    public TestTableDTO findTestTableById(long id) {
        TestTableDO testTableDO = testTableMapper.selectById(id);
        return TestConvertor.INSTANCE.toTestTableDTO(testTableDO);
    }
}
