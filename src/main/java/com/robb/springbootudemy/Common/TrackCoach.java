package com.robb.springbootudemy.Common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "8 800m repeats";
    }
}
