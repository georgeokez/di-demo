package com.george.dev.didemo.controllers;

import com.george.dev.didemo.services.GreetingServiceImpl;

/**
 * Created by George on 11/11/2018.
 */

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
