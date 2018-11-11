package com.george.dev.didemo.controllers;

import com.george.dev.didemo.services.GreetingServiceImpl;

/**
 * Created by George on 11/11/2018.
 */

public class ConstructorInjectedController {

    public GreetingServiceImpl greetingService;

    public ConstructorInjectedController(GreetingServiceImpl greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
