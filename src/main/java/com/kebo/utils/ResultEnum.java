package com.kebo.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultEnum {
    UNKNOW_ERROR("00002", "未知错误😰"),
    NOTFOUND("00001", "未找到该对象😰"),
    SUCCESS("00000", "成功了o(*￣▽￣*)ブ");
    private String code;
    private String msg;
}