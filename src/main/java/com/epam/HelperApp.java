package com.epam;

import java.time.LocalTime;

/**
 * Created by Almas_Doskozhin
 * on 9/24/2018.
 */
public class HelperApp {
    public String personalizedGreeting(String name, LocalTime localTime) {
        if (localTime.getHour() < 12) {
            return String.format("Good morning, %s!", name);
        }
        return personalizedGreeting(name);
    }

    public String personalizedGreeting(String name) {
        return String.format("Hello, %s!", name);
    }
}
