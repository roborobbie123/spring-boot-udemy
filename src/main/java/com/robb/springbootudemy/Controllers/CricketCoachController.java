package com.robb.springbootudemy.Controllers;

import com.robb.springbootudemy.Components.CricketCoach;
import com.robb.springbootudemy.Interface.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CricketCoachController {

    // private field for dependency injection
    private Coach coach;

    // define constructor for dependency injection
    @Autowired
    public CricketCoachController(Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }
}
