package com.epam;

import org.hamcrest.core.Is;
import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by Almas_Doskozhin
 * on 9/24/2018.
 */
public class HelperAppTest {
    private HelperApp app = new HelperApp();

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void personalizedGreeting_shouldReturnGreetingWithAName_whenGivenName() {
        //GIVEN
        String expectedGreeting = "Hello, Tom!";

        //WHEN
        String greeting = app.personalizedGreeting("Tom", LocalTime.now());

        //THEN
        assertThat(greeting, Is.is(expectedGreeting));
    }

    @Test
    public void personalizedGreeting_shouldReturnGoodMorning_whenCurrentTimeLessThanNoon() {
        //GIVEN
        LocalTime localTime = LocalTime.of(6, 30);
        String expectedGreeting = "Good morning, Tom!";

        //WHEN
        String greeting = app.personalizedGreeting("Tom", localTime);

        //THEN
        assertThat(greeting, Is.is(expectedGreeting));
    }
}