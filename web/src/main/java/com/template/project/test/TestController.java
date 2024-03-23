package com.template.project.test;

import com.template.project.test.convertor.TestResponseConvertor;
import com.template.project.test.request.TestRequest;
import com.template.project.test.response.TestTableResponse;
import dto.test.TestTableDTO;
import enums.error.SystemErrorCode;
import exception.TemplateException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import utils.ResultVO;

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
    public ResultVO<List<TestTableResponse>> findTestTables() {
        log.info("enter TestController --> test() method...");
        List<TestTableDTO> testTables = testService.findTestTables();
        List<TestTableResponse> testTableResponseList = TestResponseConvertor.INSTANCE.toTestTableResponseList(testTables);
        return ResultVO.success(testTableResponseList);
    }

    @GetMapping("/findTestTableById")
    public ResultVO<TestTableResponse> findTestTableById(@RequestParam("id") long id) {
        log.info("enter TestController -->  findTestTableById() method, id :{}", id);
        TestTableDTO testTableDTO = testService.findTestTableById(id);
        TestTableResponse testTableResponse = TestResponseConvertor.INSTANCE.toTestTableResponse(testTableDTO);
        return ResultVO.success(testTableResponse);
    }

    @PostMapping("/testParamCheck")
    public ResultVO<Void> testParamCheck(@RequestBody @Validated TestRequest testRequest) {
        log.error("testParamCheck --> check success, test request:{}", testRequest);
        return ResultVO.success(null);
    }

    @PostMapping("/testRuntimeException")
    public ResultVO<Void> testRuntimeException(@RequestBody @Validated TestRequest testRequest) {
        if (!testRequest.getTestMsg().equals("success")) {
            throw new IllegalArgumentException("wrong request param");
        }
        return ResultVO.success(null);
    }

    @PostMapping("/testTemplateException")
    public ResultVO<Void> testTemplateException(@RequestBody @Validated TestRequest testRequest) {
        if (!testRequest.getTestMsg().equals("success")) {
            throw new TemplateException(SystemErrorCode.SYSTEM_ERROR_PARAMETER_VALUE_INVALID, "wrong request param");
        }
        return ResultVO.success(null);
    }
}
