package com.example.domain;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class ActivityHopperTests {

    private ActivityHopper testActivityHopper;

    @Before
    public void setup() {
        testActivityHopper = new ActivityHopper();
        testActivityHopper.add("Go for a walk");
        testActivityHopper.add("Take a nap");
        testActivityHopper.add("Tidy");
    }

    @Test
    public void containsAddedActivity() {
        testActivityHopper.add("Fold laundry");
        assertTrue(testActivityHopper.contains("Fold laundry"));
    }

    @Test
    public void doesNotContainUnaddedActivity() {
        assertFalse(testActivityHopper.contains("Fold laundry"));
    }

    @Test
    public void sizeDoesNotIncreaseWhenAddingTwoActivitiesWithSameName() {
        int initialSize = testActivityHopper.getSize();
        testActivityHopper.add("Task 123");
        testActivityHopper.add("Task 123");
        assertEquals(initialSize + 1, testActivityHopper.getSize());

    }

    @Test
    public void closedActivitiesIncreasesByOneAfterSelectingActivity() {
        int initialClosedActivities = testActivityHopper.getNumClosedActivities();
        testActivityHopper.getRandomActivity();
        int finalClosedActivities = testActivityHopper.getNumClosedActivities();
        assertEquals(initialClosedActivities + 1, finalClosedActivities);
    }

    @Test
    public void selectRandomEventuallySelectsAddedActivity() {
        boolean foundNeedle = false;
        while(testActivityHopper.getSize() > 0) {
            String activity = testActivityHopper.getRandomActivity();
            if (activity.equals("Go for a walk")) {
                foundNeedle = true;
            }
        }
        assertTrue(foundNeedle);
    }

    @Test
    public void selectRandomDoesNotAlwaysSelectSameActivity() {
        String firstSelectedActivity = null;
        boolean foundADifferentActivity = false;
        for (int i = 0; i < 100; i++) {
            testActivityHopper = new ActivityHopper();
            testActivityHopper.add("Task 1");
            testActivityHopper.add("Task 2");
            testActivityHopper.add("Task 3");
            String activity = testActivityHopper.getRandomActivity();
            if (i == 0) {
                firstSelectedActivity = activity;
            } else {
                foundADifferentActivity = !(activity.equals(firstSelectedActivity));
            }
        }
        assertTrue(foundADifferentActivity);
    }
    
}
