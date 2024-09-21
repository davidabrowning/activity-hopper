package com.example.ui;

import com.example.domain.ActivityHopper;
import java.util.Scanner;

public class CommandPromptLauncher {

    Scanner userInputRetriever;
    ActivityHopper activityHopper;
    String activityProposal;

    public static void main(String[] args) {
        CommandPromptLauncher cpl = new CommandPromptLauncher();
        cpl.go();
    }

    private void go() {
        // Initialize variables
        userInputRetriever = new Scanner(System.in);
        activityHopper = new ActivityHopper();
        activityProposal = "";

        configureActivityHopper();
        printMenuForUser();
    }

    private void configureActivityHopper() {
        activityHopper.populate();
    }

    private void printMenuForUser() {
        while(true) {
            activityProposal = activityHopper.getRandomActivity();
            System.out.printf("%n%s%n", activityProposal);
            System.out.printf("N to propose new activity, any other key to quit: ");
            String menuSelection = userInputRetriever.nextLine();
            if (menuSelection.charAt(0) == 'N' || menuSelection.charAt(0) == 'n') {
                continue;
            } else {
                break;
            }
        }
        System.out.printf("%nThank you, enjoy your activity!%n%n");
    }
    
}
