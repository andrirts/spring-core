package com.core.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println(getClass().getSimpleName() + " created");
    }

    // @PostConstruct
    // public void doMyStartupStuff(){
    //     System.out.println("CricketCoach: inside method doMyStartupStuff()");
    // }

    // @PreDestroy
    // public void doMyCleanupStuff(){
    //     System.out.println("CricketCoach: inside method doMyCleanupStuff()");
    // }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

}
