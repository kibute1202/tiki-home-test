package com.sdt.tikihometest.ui.home;

import androidx.test.core.app.ActivityScenario;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import com.sdt.tikihometest.R;

import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4ClassRunner.class)
public class HomeActivityTest {

    @Test
    public void isActivityInView() {
        ActivityScenario<HomeActivity> activityScenario = ActivityScenario.launch(HomeActivity.class);
        onView(withId(R.id.container)).check(matches(isDisplayed()));
    }

}