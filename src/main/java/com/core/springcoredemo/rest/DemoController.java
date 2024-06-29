package com.core.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.core.springcoredemo.common.Coach;

@RestController
public class DemoController {
    private Coach myCoach;
    private Coach anotherCoach;

    // Constructor Injection
    public DemoController(
            @Qualifier("trackCoach") Coach myCoach,
            @Qualifier("trackCoach") Coach anotherCoach) {
        this.myCoach = myCoach;
        this.anotherCoach = anotherCoach;
    }

    // Setter Injection
    // @Autowired
    // public void setCoach(@Qualifier("cricketCoach") Coach myCoach) {
    // this.myCoach = myCoach;
    // }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing beans: " + (myCoach == anotherCoach);
    }

}
