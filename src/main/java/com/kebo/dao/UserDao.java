package com.kebo.dao;

import com.kebo.po.Btfa;
import com.kebo.po.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @description:
 * @author: kb
 * @create: 2020-06-23 10:18
 **/
public interface UserDao extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {
}

