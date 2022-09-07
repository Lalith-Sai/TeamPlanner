package com.teamplanner.web;

import com.teamplanner.data.DataConfig;
import com.teamplanner.logic.LogicConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({DataConfig.class,
LogicConfig.class,
WebConfig.class})
public class WebApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}
