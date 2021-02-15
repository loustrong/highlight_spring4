package com.tom.DemoApp.highlight_spring4.chapter01.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Main
 *
 * @author Tom on 2021/2/14
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.sayHello("world"));
        context.close();
    }
}
