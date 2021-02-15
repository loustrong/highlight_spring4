package com.tom.DemoApp.highlight_spring4.chapter03.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
@Service
public class AsyncTaskService {
	
	@Async //1
    public void executeAsyncTask(Integer i){
        System.out.println("execute async task: "+i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i){
        System.out.println("execute async task+1: "+(i+1));
    }

}
