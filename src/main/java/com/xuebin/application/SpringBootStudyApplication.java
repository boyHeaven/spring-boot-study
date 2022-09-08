package com.xuebin.application;

import org.hibernate.validator.internal.util.privilegedactions.SetContextClassLoader;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.util.*;

/**
 * @Date: 2022/3/25 11:36 上午
 * @Author: xuebin.yang
 */
@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringBootStudyApplication implements ApplicationContextInitializer {


    public static void main(String[] args) {

//        Integer a = 1;
//        Integer b = 1;
//        Long c = 1L;
//        Integer d = 129;
//        Integer e = 129;
//        System.out.println(a == b); // true -128 - 127 之间是IntegerCache数据，相同的对象
//        System.out.println(d == e); // 不再IntegerCache中，不同的对象，
//        System.out.println(a.equals(b)); //比较两个整型值Integer.intValue

//        System.out.println(a.equals(c));

//        int anInt = getInt();
//        System.out.println(anInt);

        SpringApplication.run(SpringBootStudyApplication.class, args);
    }

    public static int getInt() {
        int a = 10;
        try {
            System.out.println(a / 0);
            a = 20;
        } catch (ArithmeticException e) {
            return 30;
        } finally {
            a = 40;
            return a;
        }

    }


    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        Map<String, Integer> h = new HashMap<>();

        int i = 0;
        while (i < 100) {
            h.put("1", i);
            i++;
        }
    }
}

class Annoyance extends Exception {
}

class Sneeze extends Annoyance {
}

class Human {
    public static void main(String[] args) {

    }
}
