package com.tom.DemoApp.highlight_spring4.chapter01.javaconfig;

/**
 * UseFunctionService
 *
 * @author Tom on 2021/2/14
 */
public class UseFunctionService {
    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }
    public String sayHello(String word){
        return functionService.sayHello(word);

    }
}
