package com.tom.DemoApp.highlight_spring4.chapter03.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConditionConifg.class);
		
		ListService listService = context.getBean(ListService.class);
		
		
		System.out.println(context.getEnvironment().getProperty("os.name") 
				+ "The commands in the system is: "
				+ listService.showListCmd());
		
		context.close();
	}
}
