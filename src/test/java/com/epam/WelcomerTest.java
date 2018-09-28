package com.epam;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by admin
 * on 27.09.2018.
 */
public class WelcomerTest {
    Welcomer welcomer = new Welcomer();

    @Test
    public void shoulReturnPersonalizedGreetingForTom() {
        //GIVEN
        String name = "Tom";
        //WHEN
        String greeting = welcomer.welcome(name);
        //THEN
        Assert.assertEquals("Hello, Tom!", greeting);
    }

    @Test
    public void shouldReturnPersonalizedGreetingForJohn() {
        //GIVEN
        String name = "John";

        //WHEN
        String greeting = welcomer.welcome(name);

        //THEN
        Assert.assertEquals("Hello, John!", greeting);
    }
}
