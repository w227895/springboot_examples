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

/**
 * 统一异常处理
 */
@ControllerAdvice
public class ExceptionHandle {
    private Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {
        logger.error(e.getMessage());
        logger.error(e.getStackTrace(),e.printStackTrace());
        //logger.error(e.getStackTrace());
        if (e instanceof UserException) {
            UserException userException = (UserException) e;
            return ResultUtil.error(userException);
        } else {
            return ResultUtil.error(ResultEnum.UNKNOW_ERROR);
        }
    }
}
