package com.tom.DemoApp.highlight_spring4.chapter01.aop;

import java.lang.annotation.*;

/**
 * Action
 *
 * @author Tom on 2021/2/14
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
