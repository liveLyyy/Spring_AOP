package com.liyan.advice;

import org.springframework.aop.ThrowsAdvice;

public class MyThrowAdvice implements ThrowsAdvice {
    public  void myexception(){

        System.out.println("执行异常通知");
    }
}
