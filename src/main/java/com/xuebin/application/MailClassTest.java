package com.xuebin.application;

import java.util.HashMap;
import java.util.Map;

/**
 * @Date: 2022/7/25 17:38
 * @Author: xuebin.yang
 */
public class MailClassTest {

    public static void main(String[] args) {
        int anInt = getInt();
        System.out.println(anInt);
    }

    public static int getInt() {
        int a = 10;
        try {
            System.out.println(a / 0);
            a = 20;
        } catch (ArithmeticException e) {
            a = 30;
            return a;
        } finally {
            a = 40;
        }
        return a;

    }
}
