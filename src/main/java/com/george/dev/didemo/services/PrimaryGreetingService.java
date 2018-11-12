package com.george.dev.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by George on 12/11/2018.
 */

@Service
@Primary
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting(){
        return "Hello - Primary Gretting service";
    }
}
