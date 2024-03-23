package com.template.project.test.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class TestRequest {

    @NotBlank(message = "testMsg不能为空")
    private String testMsg;
}
