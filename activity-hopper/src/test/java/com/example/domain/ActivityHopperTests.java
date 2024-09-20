package com.example.domain;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class ActivityHopperTests {

    private ActivityHopper testActivityHopper;

    @Before
    public void setup() {
        testActivityHopper = new ActivityHopper();
        testActivityHopper.add(new Activity("Go to the gym"));
        testActivityHopper.add(new Activity("Go for a walk"));
        testActivityHopper.add(new Activity("Have a snack"));
    }

    @Test
    public void containsAddedActivity() {
        Activity foldLaundry = new Activity("Fold laundry");
        testActivityHopper.add(foldLaundry);
        assertTrue(testActivityHopper.contains(foldLaundry));
    }

    @Test
    public void doesNotContainUnaddedActivity() {
        Activity foldLaundry = new Activity("Fold laundry");
        assertFalse(testActivityHopper.contains(foldLaundry));
    }

    @Test
    public void sizeDoesNotIncreaseWhenAddingTwoActivitiesWithSameName() {
        Activity a1 = new Activity("Task 23");
        Activity a2 = new Activity("Task 23");
        int initialSize = testActivityHopper.getSize();
        testActivityHopper.add(a1);
        testActivityHopper.add(a2);
        assertEquals(initialSize + 1, testActivityHopper.getSize());

    }

    @Test
    public void declinedActivitiesIncreasesByOneAfterDecliningActivity() {
        Activity declinedActivity = new Activity("Task 789");
        testActivityHopper.add(declinedActivity);
        int initialDeclinedActivitiesSize = testActivityHopper.getNumDeclinedActivities();
        declinedActivity.decline();
        int finalDeclinedActivitiesSize = testActivityHopper.getNumDeclinedActivities();
        assertEquals(initialDeclinedActivitiesSize + 1, finalDeclinedActivitiesSize);
    }

    @Test
    public void selectRandomEventuallySelectsAddedActivity() {
        Activity needle = new Activity("Go for a walk");
        boolean foundNeedle = false;
        while(testActivityHopper.getSize() > testActivityHopper.getNumDeclinedActivities()) {
            Activity a = testActivityHopper.getRandomActivity();
            if (a.equals(needle)) {
                foundNeedle = true;
            }
            a.decline();
        }
        assertTrue(foundNeedle);
    }
    
}
