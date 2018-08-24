package com.company.screens;

import java.util.Scanner;

public class LoginScreen {

    private LoginScreen(){
        this.adminUsername = "jose";
        this.adminPassword = "augusto";
    }

    private static LoginScreen singleInstance = new LoginScreen();
    public static LoginScreen getInstance() { return singleInstance; }

    private String adminUsername;
    private String adminPassword;

    public void startLoginScreen(){
        int errorCounter = 0;

        while(errorCounter < 3){
            for(int i = 0; i < 100; ++i) System.out.println();

            System.out.println("--- ISOCCER ---");
            System.out.println();

            System.out.print("Type the username: ");
            String attemptUsername = new Scanner(System.in).nextLine();
            System.out.print("Type the password: ");
            String attemptPassword = new Scanner(System.in).nextLine();

            if(this.adminUsername.equals(attemptUsername) && this.adminPassword.equals(attemptPassword)) {
                MainScreen.getInstance().startMainScreen();
                return;
            } else {
                System.out.println("Try again");
                new Scanner(System.in).nextLine();
            }
        }
    }
}
