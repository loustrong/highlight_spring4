package com.tom.DemoApp.highlight_spring4.chapter02.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {
	@PostConstruct //1
    public void init(){
        System.out.println("jsr250-init-method");
    }
    public JSR250WayService() {
        super();
        System.out.println("Initial-Constructor-JSR250WayService");
    }
    @PreDestroy //2
    public void destroy(){
        System.out.println("jsr250-destory-method");
    }

}
