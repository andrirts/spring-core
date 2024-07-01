package com.core.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.core.springcoredemo.common.Coach;

@RestController
public class DemoController {
    private Coach myCoach;

    // Constructor Injection
    public DemoController(
            @Qualifier("swimCoach") Coach myCoach) {
        this.myCoach = myCoach;
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


}
