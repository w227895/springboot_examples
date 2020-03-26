package com.kebo.exception;

/**
 * @description:
 * @Author: kb
 * @Date: 2020-03-26 15:14
 */

import com.kebo.utils.Result;
import com.kebo.utils.ResultEnum;
import com.kebo.utils.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理
 */
@ControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {
        if (e instanceof UserException) {
            UserException userException = (UserException) e;
            return ResultUtil.error(userException);
        } else {
            return ResultUtil.error(ResultEnum.UNKNOW_ERROR);
        }
    }
}
