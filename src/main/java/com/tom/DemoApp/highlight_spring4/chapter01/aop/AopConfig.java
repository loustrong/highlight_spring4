package com.tom.DemoApp.highlight_spring4.chapter01.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * AopConfig
 *
 * @author Tom on 2021/2/14
 */
@Configuration
@ComponentScan("com.tom.DemoApp.highlight_spring4.chapter01.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
