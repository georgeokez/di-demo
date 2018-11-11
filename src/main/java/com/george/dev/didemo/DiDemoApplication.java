package com.george.dev.didemo;

import com.george.dev.didemo.controllers.HomeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

       ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);

        HomeController controller = (HomeController) context.getBean("homeController");

        controller.hello();
    }
}
