package com.company;

import com.company.screens.LoginScreen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean inMain = true;

        while(inMain){
            try {
                for(int i = 0; i < 100; ++i) System.out.println();

                System.out.println("--- ISOCCER ---");
                System.out.println();
                System.out.println("0 - Login");
                System.out.println("1 - Exit");

                int choosedNumber = new Scanner(System.in).nextInt();

                switch (choosedNumber){
                    case 0:
                        LoginScreen.getInstance().startLoginScreen();
                        break;
                    case 1:
                        return;
                    default:
                        return;
                }

            } catch (Exception e) {
                System.out.println("Try again");
                e.printStackTrace();
                new Scanner(System.in).nextLine();
            }
        }
    }
}
