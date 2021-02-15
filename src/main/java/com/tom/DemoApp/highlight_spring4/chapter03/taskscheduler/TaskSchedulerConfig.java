package com.tom.DemoApp.highlight_spring4.chapter03.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.tom.DemoApp.highlight_spring4.chapter03.taskscheduler")
@EnableScheduling //1
public class TaskSchedulerConfig {

}
