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
        if (openActivities.size() == 0) {
            if (closedActivities.size() == 0) {
                return "Sorry, no activities added";
            }
            for(String a : closedActivities) {
                openActivities.add(a);
            }
            closedActivities.clear();
        }
        int activityNum = (int) (Math.random() * openActivities.size());
        String activity = openActivities.get(activityNum);
        openActivities.remove(activity);
        closedActivities.add(activity);
        return activity;
    }

    public void populate() {
        openActivities.add("Go for a walk");
        openActivities.add("Take a shower");
        openActivities.add("Take a nap");
        openActivities.add("Tidy");
        openActivities.add("Do some sit-ups or planks");
        openActivities.add("Go to the gym");
        openActivities.add("Throw the lacrosse ball against the wall");
        openActivities.add("Go to the library");
        openActivities.add("Work on some CS homework");
        openActivities.add("Work on a CS project");
        openActivities.add("Work on a GTD task");
        openActivities.add("Go for a jog");
        openActivities.add("Go grocery shopping");
        openActivities.add("Make a snack or meal");
        openActivities.add("Work on a crossword puzzle");
        openActivities.add("Read a book");
        openActivities.add("Do some yoga/stretching");
        openActivities.add("Listen to the radio");
        openActivities.add("Watch a documentary");
    }

}
