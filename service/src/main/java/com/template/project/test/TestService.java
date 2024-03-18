package com.template.project.test;


import dto.test.TestTableDTO;

import java.util.List;

public interface TestService {


    public List<TestTableDTO> findTestTables();

    public TestTableDTO findTestTableById(long id);
}
