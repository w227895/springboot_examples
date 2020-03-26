package com.kebo.service;


import com.kebo.dao.BtfaDao;
import com.kebo.po.Btfa;
import com.kebo.utils.ResultEnum;
import com.kebo.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BtfaService {
    @Autowired
    private BtfaDao btfaDao;

    public void save(Btfa btfa){
        btfaDao.save(btfa);
    }

    public Page<Btfa> findAll(int page , int size ){
        Sort sort = Sort.by("btfaStart").ascending().and(Sort.by("btfaEnd").ascending());
        PageRequest pageRequest = PageRequest.of(page-1, size,sort);
        return btfaDao.findAll(pageRequest);
    }

    public void delete(Integer id){
        btfaDao.deleteById(id);
    }

    public Optional<Btfa> findById(Integer id){
       /* Optional<Btfa> btfa=btfaDao.findById(id);
        if(btfa.isPresent()){
            return btfa.get();
        }*/
        return btfaDao.findById(id);
    }
}
