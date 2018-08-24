package com.company.screens;

import java.util.Scanner;

public class MainScreen {

    private MainScreen(){
    }

    private static MainScreen singleInstance = new MainScreen();
    public static MainScreen getInstance() { return singleInstance; }

    public void startMainScreen(){
        boolean inMainScreen = true;

        while(inMainScreen){
            try {
                for(int i = 0; i < 100; ++i) System.out.println();

                System.out.println("--- ISOCCER ---");
                System.out.println();
                System.out.println("0 - Add employee");
                System.out.println("1 - Add supporter");
                System.out.println("2 - Manage resources");
                System.out.println("3 - Get reports");
                System.out.println("4 - Exit");

                int choosedNumber = new Scanner(System.in).nextInt();

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
                System.out.println("Try again");
                e.printStackTrace();
                new Scanner(System.in).nextLine();
            }
        }
    }
}
