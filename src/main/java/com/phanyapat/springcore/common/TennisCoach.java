package com.phanyapat.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    public  TennisCoach(){
        System.out.println("In constructor " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice backhand volley for 123 min";
    }
}
