package com.dmdev.sprig;

import com.dmdev.sprig.database.pool.ConnectionPool;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        System.out.println(context.getBean("pool1"));
        System.out.println(context.getBean("pool2"));
    }
}