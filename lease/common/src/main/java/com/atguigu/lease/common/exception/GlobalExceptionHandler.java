package com.atguigu.lease.common.exception;

import com.atguigu.lease.common.result.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(LeaseException.class)
    @ResponseBody
    public Result handle(LeaseException  e){
        e.getMessage();
        e.printStackTrace();
        return Result.fail(e.getCode(),e.getMessage());
    }
}
