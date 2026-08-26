package com.example;

import org.apache.commons.lang3.StringUtils;

public class App {

    public String greeting(String name) {
        if (StringUtils.isBlank(name)) {
            return "Hello, World!";
        }
        return "Hello, " + StringUtils.capitalize(name.trim()) + "!";
    }

    public static void main(String[] args) {
        App app = new App();
        String name = args.length > 0 ? args[0] : null;
        System.out.println(app.greeting(name));
        System.out.println("Goodbye!");
    }
}
