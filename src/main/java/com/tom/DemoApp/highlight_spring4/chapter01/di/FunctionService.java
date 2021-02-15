package com.tom.DemoApp.highlight_spring4.chapter01.di;

import org.springframework.stereotype.Service;

/**
 * FunctionService
 *
 * @author Tom on 2021/2/14
 */
@Service
public class FunctionService {
    public String sayHello(String word){
        return "Hello " + word + "!";
    }
}
