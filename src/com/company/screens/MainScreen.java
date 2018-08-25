package com.company.screens;

import com.company.util.Utility;

import java.util.Scanner;

public class MainScreen {

    private MainScreen(){
    }

    private static MainScreen singleInstance = new MainScreen();
    public static MainScreen getInstance() { return singleInstance; }

    public void startMainScreen(){
        while(true){
            try {
                Utility.getInstance().clearTerminal();
                Utility.getInstance().printHeader();

                System.out.println("0 - Add employee");
                System.out.println("1 - Add supporter");
                System.out.println("2 - Manage resources");
                System.out.println("3 - Get reports");
                System.out.println("4 - Exit");

                int choosedNumber = Utility.getInstance().getInputScanner().nextInt();

                switch (choosedNumber){
                    case 0:
                        AddEmployeeScreen.getInstance().startAddEmployeeScreen();
                        break;
                    case 1:
                        AddSupporterScreen.getInstance().startAddSupporterScreen();
                        break;
                    case 2:
                        ManageResourcesScreen.getInstance().startManageResourcesScreen();
                        break;
                    case 3:
                        GetReportsScreen.getInstance().startGetReportsScreen();
                        break;
                    case 4:
                        return;
                    default:
                        return;
                }
            } catch (Exception e){
                Utility.getInstance().printError("Choose a valid input", e);
            }
        }
    }
}
