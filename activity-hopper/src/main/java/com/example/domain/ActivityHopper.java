package com.example.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Holds a collection of String activities
 */
public class ActivityHopper {
    
    // Instance variables
    List<String> openActivities;
    List<String> closedActivities;

    public ActivityHopper() {
        openActivities = new ArrayList<>();
        closedActivities = new ArrayList<>();
    }

    public void add(String a) {
        if (openActivities.contains(a)) {
            return;
        }
        openActivities.add(a);
    }

    public boolean contains(String a) {
        return openActivities.contains(a);
    }

    public int getSize() {
        return openActivities.size();
    }

    public int getNumClosedActivities() {
        return closedActivities.size();
    }

    public String getRandomActivity() {
        int activityNum = (int) (Math.random() * openActivities.size());
        String activity = openActivities.get(activityNum);
        openActivities.remove(activity);
        closedActivities.add(activity);
        return activity;
    }

}
