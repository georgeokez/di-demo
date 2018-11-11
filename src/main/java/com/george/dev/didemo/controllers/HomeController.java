package com.george.dev.didemo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

/**
 * Created by George on 08/11/2018.
 */

@Controller
public class HomeController {

    private final Logger logger = LoggerFactory.getLogger(getClass().getName());

    public String hello(){
        logger.info("Hello DI!!! ");

        return "foo";
    }

}
