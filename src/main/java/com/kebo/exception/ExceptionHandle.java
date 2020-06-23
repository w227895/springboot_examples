package com.kebo.exception;

/**
 * @description:
 * @Author: kb
 * @Date: 2020-03-26 15:14
 */

import com.kebo.utils.Result;
import com.kebo.utils.ResultEnum;
import com.kebo.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * 统一异常处理
 */
@ControllerAdvice
public class ExceptionHandle {
    private Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        e.printStackTrace(new PrintStream(baos));
        String exception = baos.toString();
        logger.error(exception);
        if (e instanceof UserException) {
            UserException userException = (UserException) e;
            return ResultUtil.error(userException);
        } else {
            return ResultUtil.error(ResultEnum.UNKNOW_ERROR);
        }
    }
}
