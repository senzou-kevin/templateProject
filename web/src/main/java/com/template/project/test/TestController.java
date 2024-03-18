package com.template.project.test;

import com.template.project.test.convertor.TestResponseConvertor;
import com.template.project.test.response.TestTableResponse;
import dto.test.TestTableDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: kevin-senzou
 **/
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/findTestTables")
    public List<TestTableResponse> findTestTables() {
        log.info("enter TestController --> test() method...");
        List<TestTableDTO> testTables = testService.findTestTables();
        return TestResponseConvertor.INSTANCE.toTestTableResponseList(testTables);
    }

    @GetMapping("/findTestTableById")
    public TestTableResponse findTestTableById(@RequestParam("id") long id) {
        log.info("enter TestController -->  findTestTableById() method, id :{}", id);
        TestTableDTO testTableDTO = testService.findTestTableById(id);
        return TestResponseConvertor.INSTANCE.toTestTableResponse(testTableDTO);
    }
}
