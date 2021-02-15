package com.tom.DemoApp.highlight_spring4.chapter01.aop;

import org.springframework.stereotype.Service;

/**
 * DemoAnnotationService
 *
 * @author Tom on 2021/2/14
 */
@Service
public class DemoAnnotationService {
    @Action(name="add method")
    public void add(){}
}
