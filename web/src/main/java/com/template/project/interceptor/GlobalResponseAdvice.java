package com.template.project.interceptor;

import enums.error.SystemErrorCode;
import exception.TemplateException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import utils.ResultVO;

import javax.servlet.http.HttpServletRequest;


@Slf4j
@RestControllerAdvice
public class GlobalResponseAdvice {


    @ExceptionHandler(RuntimeException.class)
    public <T> ResultVO<T> runtimeExceptionHandler(RuntimeException e, HttpServletRequest request) {
        log.error("request error:" + request.getRequestURI(), e);
        return ResultVO.fail(SystemErrorCode.SYSTEM_ERROR, e.getMessage());
    }

    @ExceptionHandler(TemplateException.class)
    public <T> ResultVO<T> templateExceptionHandler(TemplateException e) {
        return ResultVO.fail(e.getErrorCode(), e.getMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public <T> ResultVO<T> returnNotValidException(MethodArgumentNotValidException e, HttpServletRequest request) {
        log.error("request error:" + request.getRequestURI(), e);
        return ResultVO.fail(SystemErrorCode.SYSTEM_ERROR_PARAMETER_INVALID, "invalid params");
    }
}
