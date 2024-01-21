package com.yubi.fullstack.webstatus.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {
//    @Scheduled(fixedRateString = "PT02S")
    public void schedule(){
        System.out.println("hi");
    }
}
