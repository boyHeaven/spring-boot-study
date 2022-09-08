package com.xuebin.application.service;

import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Service;

/**
 * @Date: 2022/7/21 21:13
 * @Author: xuebin.yang
 */
@Service
public class TestB {

    @Autowired
    private TestA testA;


}
