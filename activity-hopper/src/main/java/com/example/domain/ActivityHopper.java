package com.example.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Holds a collection of Activities
 */
public class ActivityHopper {
    
    // Instance variables
    List<Activity> activitiesList;

    public ActivityHopper() {
        activitiesList = new ArrayList<>();
    }

    public void add(Activity a) {
        if (activitiesList.contains(a)) {
            return;
        }
        activitiesList.add(a);
    }

    public boolean contains(Activity a) {
        return activitiesList.contains(a);
    }

    public int getSize() {
        return activitiesList.size();
    }

    public int getNumDeclinedActivities() {
        int count = (int) activitiesList.stream()
            .filter(a -> a.isDeclined())
            .count();
        return count;
    }

    public Activity getRandomActivity() {
        return activitiesList.get(0);
    }

}
