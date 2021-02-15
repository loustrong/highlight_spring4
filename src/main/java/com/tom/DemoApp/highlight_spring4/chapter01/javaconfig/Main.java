package com.tom.DemoApp.highlight_spring4.chapter01.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Main
 *
 * @author Tom on 2021/2/14
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("java Config"));
        context.close();
    }
}
