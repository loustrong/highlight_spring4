package com.tom.DemoApp.highlight_spring4.chapter02.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

	public void onApplicationEvent(DemoEvent event) {
		
		String msg = event.getMsg();
		
		System.out.println("I(bean-demoListener)  Accept bean-demoPublisher published message:"
				+ msg);

	}

}
