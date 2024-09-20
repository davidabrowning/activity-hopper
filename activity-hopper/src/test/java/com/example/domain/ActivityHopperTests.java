package com.example.domain;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class ActivityHopperTests {

    private ActivityHopper testActivityHopper;

    @Before
    void setup() {
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
    
}
