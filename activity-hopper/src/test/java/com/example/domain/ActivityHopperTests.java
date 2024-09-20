package com.example.domain;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class ActivityHopperTests {

    private ActivityHopper testActivityHopper;

    @Before
    public void setup() {
        testActivityHopper = new ActivityHopper();
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
    public void selectRandomEventuallySelectsAddedActivity() {
        assertTrue(false);
    }
    
}
