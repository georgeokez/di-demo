package com.george.dev.didemo.services;

import org.springframework.stereotype.Service;

/**
 * Created by George on 11/11/2018.
 */

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello Gurus!!!";

    @Override
    public String sayGreeting(){
        return HELLO_GURUS;
    }

}
