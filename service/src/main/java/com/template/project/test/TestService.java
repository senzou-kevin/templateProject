package com.template.project.test;


import dto.test.TestTableDTO;

import java.util.List;

public interface TestService {


    List<TestTableDTO> findTestTables();

    TestTableDTO findTestTableById(long id);
}
