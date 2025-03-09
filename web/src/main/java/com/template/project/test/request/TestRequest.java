package com.template.project.test.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class TestRequest {

    @NotBlank(message = "testMsg不能为空")
    private String testMsg;
}
