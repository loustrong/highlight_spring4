package com.tom.DemoApp.highlight_spring4.chapter03.annotation;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
	
	public void outputResult(){
		System.out.println("Get Bean from composited annotation.");
	}

}
