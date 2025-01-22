package org.tasks.management;


import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {
        "org.tasks.management.service"      // Other module
})
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}