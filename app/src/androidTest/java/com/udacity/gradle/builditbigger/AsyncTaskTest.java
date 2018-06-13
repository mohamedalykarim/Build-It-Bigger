package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.isEmptyString;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;


@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest{

    MainActivity activity;

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setup(){
        activity = activityTestRule.getActivity();
    }

    @Test
    public void testTheAsyncTask(){
        assertThat(activity.joke, not(isEmptyString()));
    }


}
