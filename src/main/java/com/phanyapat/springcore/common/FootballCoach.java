package com.phanyapat.springcore.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

    public  FootballCoach(){
        System.out.println("In constructor " + getClass().getSimpleName());
    }

    //define init method
    @PostConstruct
    public  void  doStartupStuff(){
        System.out.println("In doStartupStuff " + getClass().getSimpleName());
    }

    //define destroy method
    @PreDestroy
    public  void  doCleanupStuff(){
        System.out.println("In doCleanupStuff " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast shoot for 15 min";
    }
}
