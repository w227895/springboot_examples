package com.kebo.dao;


import com.kebo.po.Btfa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BtfaDao extends JpaRepository<Btfa, Integer>, JpaSpecificationExecutor<Btfa> {

}
