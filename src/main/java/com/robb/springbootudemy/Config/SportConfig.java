package com.robb.springbootudemy.Config;

import com.robb.springbootudemy.Common.Coach;
import com.robb.springbootudemy.Common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
