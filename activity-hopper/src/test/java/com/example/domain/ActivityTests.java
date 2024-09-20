package com.example.domain;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class ActivityTests {

    private Activity testActivity;

    @Before
    public void setup() {
        testActivity = new Activity("Fold laundry");
    }

    @Test
    public void assignedNameMatchesReturnedName() {
        assertEquals("Fold laundry", testActivity.getName());
    }

    @Test
    public void activityDefaultsToNotDeclined() {
        assertFalse(testActivity.isDeclined());
    }
    
}