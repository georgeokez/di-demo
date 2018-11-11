package com.george.dev.didemo.controllers;

import com.george.dev.didemo.services.GreetingService;

/**
 * Created by George on 11/11/2018.
 */

public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }
}
