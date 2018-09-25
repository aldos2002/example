package com.epam;

import java.time.LocalTime;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        HelperApp helperApp = new HelperApp();
        System.out.println(helperApp.personalizedGreeting("Tom", LocalTime.now()));
    }
}