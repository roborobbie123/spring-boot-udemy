package com.robb.springbootudemy.Controllers;

import com.robb.springbootudemy.Common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CricketCoachController {

    // private field for dependency injection
    private Coach coach;

    // define constructor injection --> required dependencies
    @Autowired
    public CricketCoachController(@Qualifier("cricketCoach") Coach coach) {
        this.coach = coach;
    }

    // define setter injection --> optional dependencies
    /*
    @Autowired
    public void setCoach(Coach coach) {
        this.coach = coach;
    }
     */

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }
}
