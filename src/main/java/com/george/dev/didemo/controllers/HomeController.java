package com.george.dev.didemo.controllers;

import com.george.dev.didemo.services.GreetingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by George on 11/11/2018.
 */

@Controller
public class HomeController {

    private final Logger logger = LoggerFactory.getLogger(getClass().getName());

    private GreetingService greetingService;

    @Autowired
    public HomeController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        logger.info("Hello DI!!! ");

        return "foo";
    }

}
