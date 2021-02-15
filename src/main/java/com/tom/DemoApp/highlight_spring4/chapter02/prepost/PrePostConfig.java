package com.tom.DemoApp.highlight_spring4.chapter02.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.tom.DemoApp.highlight_spring4.chapter02.prepost")
public class PrePostConfig {
	
	@Bean(initMethod="init",destroyMethod="destroy") //1
	BeanWayService beanWayService(){
		return new BeanWayService();
	}
	
	@Bean
	JSR250WayService jsr250WayService(){
		return new JSR250WayService();
	}

}
