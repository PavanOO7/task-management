package org.tasks.management;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {
        "org.tasks.management.controller",  // Main module
        "org.tasks.management.service"      // Other module
})
public class AppEngineApplication {
    public static void main(String[] args) {
        SpringApplication.run(AppEngineApplication.class, args);
    }
}