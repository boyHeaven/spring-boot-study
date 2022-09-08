package com.xuebin.application.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Date: 2022/7/21 21:12
 * @Author: xuebin.yang
 */
@Service
@Aspect
public class TestA {

    @Autowired
    private TestB testB;

}
