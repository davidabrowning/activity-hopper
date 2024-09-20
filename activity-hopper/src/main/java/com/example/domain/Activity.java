package com.example.domain;

/**
 * 
 * @param name
 * @author David Browning
 */
public class Activity {

    // Constants
    private static final int MAX_NAME_LENGTH = 30;

    // Instance variables
    private String name;
    private boolean declined;

    /**
     * Constructs a new Activity.
     * @param name The desired name of the new activity (max 30 characters).
     */
    public Activity(String name) {
        this.name = name;
        this.declined = false;
    }

    /**
     * Returns the Activity's name.
     * @return A String representing the Activity's name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Returns a boolean representing whether the user has declined to do this Activity yet.
     * @return The boolean declined value, initially set to false until the user declines the Activity.
     */
    public boolean isDeclined() {
        return declined;
    }
}
