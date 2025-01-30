package com.robb.springbootudemy.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/goodbye")
    public String goodbye() {
        return "goodbye";
    }

    // inject properties for: coach.name and team.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String teamInfo() {
        return "Coach: " + coachName + ", Team name: " + teamName;
    }

}
