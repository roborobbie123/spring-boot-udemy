package com.robb.springbootudemy.Common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getName());
    }

    // init method
    @PostConstruct
    public void init() {
        System.out.println("In init: " + getClass().getSimpleName());
    }

    // destroy method
    @PreDestroy
    public void destroy() {
        System.out.println("In destroy: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!";
    }
}
