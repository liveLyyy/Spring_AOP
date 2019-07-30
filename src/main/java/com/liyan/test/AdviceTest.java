package com.liyan.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdviceTest {
    @Test
    public void test(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        Demo demo=applicationContext.getBean("demo",Demo.class);
        try {
            demo.demo1();
        } catch (Exception e) {
//            e.printStackTrace();
        }

    }
}
