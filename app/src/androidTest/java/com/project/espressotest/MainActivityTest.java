package com.project.espressotest;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityTest {

    // Preferred JUnit 4 mechanism of specifying the activity to be launched before each test

    private String num1 = "5";
    private String num2 = "10";
    private String sum = String.valueOf(5 + 10);

    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule =
            new ActivityScenarioRule<MainActivity>(MainActivity.class);

    @Test
    public void validateEditText() {
        onView(withId(R.id.txt_num1)).perform(typeText(num1)).check(matches(withText(num1)));
        onView(withId(R.id.txt_num2)).perform(typeText(num2)).check(matches(withText(num2)));
        onView(withId(R.id.btn_add)).perform(click());
        onView(withId(R.id.tv_sum)).check(matches(withText(sum)));
    }
}