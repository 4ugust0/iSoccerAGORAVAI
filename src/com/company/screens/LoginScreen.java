package com.company.screens;

import com.company.util.Utility;

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

        while(errorCounter++ < 3){
            Utility.getInstance().clearTerminal();
            Utility.getInstance().printHeader();

            System.out.print("Type the username: ");
            String attemptUsername = Utility.getInstance().getInputScanner().nextLine();
            System.out.print("Type the password: ");
            String attemptPassword = Utility.getInstance().getInputScanner().nextLine();

            if(this.adminUsername.equals(attemptUsername) && this.adminPassword.equals(attemptPassword)) {
                MainScreen.getInstance().startMainScreen();
                return;
            } else {
                System.out.println("Try again");
                Utility.getInstance().getInputScanner().nextLine();
            }
        }
    }
}
