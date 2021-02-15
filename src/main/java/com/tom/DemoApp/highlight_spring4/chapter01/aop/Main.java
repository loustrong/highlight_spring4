package com.tom.DemoApp.highlight_spring4.chapter01.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Main
 *
 * @author Tom on 2021/2/14
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
        demoAnnotationService.add();
        demoMethodService.add();
        context.close();
    }
}
