package com.company.screens;

import com.company.system.Core;
import com.company.util.Utility;

import java.util.Scanner;

public class AddSupporterScreen {

    private AddSupporterScreen(){
    }

    private static AddSupporterScreen singleInstance = new AddSupporterScreen();
    public static AddSupporterScreen getInstance() { return singleInstance; }

    public void startAddSupporterScreen(){
        Utility.getInstance().printHeader();

        System.out.print("Type the full name: ");
        String fullName = Utility.getInstance().getInputScanner().nextLine();
        System.out.print("Type the email: ");
        String eMail = Utility.getInstance().getInputScanner().nextLine();
        System.out.print("Type the cpfNumber: ");
        String cpfNumber = Utility.getInstance().getInputScanner().nextLine();
        System.out.print("Type the phoneNumber: ");
        String phoneNumber = Utility.getInstance().getInputScanner().nextLine();
        System.out.print("Type the supporter type: ");
        String supporterType = Utility.getInstance().getInputScanner().nextLine();

        if(cpfNumber.matches("[0-9]{11}") && phoneNumber.matches("[0-9]{9}")
                && supporterType.matches("JUNIOR|SENIOR|ELITE")){
            Core.getInstance().addSupporter(fullName, eMail, cpfNumber, phoneNumber, supporterType);
        } else {
            System.out.println("Invalid input, try again");
            Utility.getInstance().getInputScanner().nextLine();
        }
    }
}
