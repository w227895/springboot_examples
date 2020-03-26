package com.kebo.controller;


import com.alibaba.fastjson.JSONObject;

import com.kebo.po.Btfa;
import com.kebo.service.BtfaService;
import com.kebo.utils.Result;
import com.kebo.utils.ResultEnum;
import com.kebo.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


/**
 * @program: hmbtdz
 * @description:
 * @author: kb
 * @create: 2020-03-24 11:38
 **/
@RestController
@RequestMapping("/btfa")
@CrossOrigin
public class BtfaController {
    @Autowired
    private BtfaService btfaService;


    @GetMapping("/findAll")
    public Result<Btfa> findAll(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int size) {
        Page<Btfa> btfaPage = btfaService.findAll(page, size);
        return ResultUtil.success(btfaPage);
    }

    @GetMapping("/findById")
    public Result<Btfa> findById(@RequestBody Btfa btfa) {
        Optional<Btfa> optional = btfaService.findById(btfa.getBtfaId());
        if (optional.isPresent()) {
            return ResultUtil.success(optional.get());
        }
        return ResultUtil.error(ResultEnum.NOTFOUND);
    }


}
