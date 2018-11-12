package com.george.dev.didemo;

import com.george.dev.didemo.controllers.ConstructorInjectedController;
import com.george.dev.didemo.controllers.HomeController;
import com.george.dev.didemo.controllers.PropertyInjectedController;
import com.george.dev.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

       ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);

        HomeController controller = (HomeController) context.getBean("homeController");

        controller.hello();

        System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(context.getBean(SetterInjectedController.class).sayHello());
        System.out.println(context.getBean(ConstructorInjectedController.class).sayHello());
    }
}
