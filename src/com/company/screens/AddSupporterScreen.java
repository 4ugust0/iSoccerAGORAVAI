package com.company.screens;

import com.company.system.Core;

import java.util.Scanner;

public class AddSupporterScreen {

    private AddSupporterScreen(){
    }

    private static AddSupporterScreen singleInstance = new AddSupporterScreen();
    public static AddSupporterScreen getInstance() { return singleInstance; }

    public void startAddSupporterScreen(){
        System.out.println("--- ISOCCER ---");
        System.out.println();

        System.out.print("Type the full name: ");
        String fullName = new Scanner(System.in).nextLine();
        System.out.print("Type the email: ");
        String eMail = new Scanner(System.in).nextLine();
        System.out.print("Type the cpfNumber: ");
        String cpfNumber = new Scanner(System.in).nextLine();
        System.out.print("Type the phoneNumber: ");
        String phoneNumber = new Scanner(System.in).nextLine();
        System.out.print("Type the supporter type: ");
        String supporterType = new Scanner(System.in).nextLine();

        if(cpfNumber.matches("[0-9]{11}") && phoneNumber.matches("[0-9]{9}")
                && supporterType.matches("JUNIOR|SENIOR|ELITE")){
            Core.getInstance().addSupporter(fullName, eMail, cpfNumber, phoneNumber, supporterType);
        } else {
            System.out.println("Invalid input, try again");
            new Scanner(System.in).nextLine();
        }
    }
}
