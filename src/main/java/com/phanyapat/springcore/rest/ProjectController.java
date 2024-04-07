package com.phanyapat.springcore.rest;

import com.phanyapat.springcore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {

    private Coach myCoach;

    private  Coach anotherCoach;

    @Autowired
    public ProjectController(@Qualifier("footballCoach") Coach theCoach,
                             @Qualifier("footballCoach") Coach theAnotherCoach){

        System.out.println("In constructor2 " + getClass().getSimpleName());

        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }

    @GetMapping("/dailyWorkout")
    public  String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public  String check(){
        return "Comparing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
    }
}
