package com.tom.DemoApp.highlight_spring4.chapter02.prepost;

public class BeanWayService {
	  public void init(){
	        System.out.println("@Bean-init-method");
	    }
	    public BeanWayService() {
	        super();
	        System.out.println("Initial-Constructor-BeanWayService");
	    }
	    public void destroy(){
	        System.out.println("@Bean-destory-method");
	    }
}
