package com.company.screens;

import com.company.models.Employee;
import com.company.models.Player;
import com.company.models.Supporter;
import com.company.system.Core;
import com.company.util.Utility;

import javax.rmi.CORBA.Util;
import java.util.Scanner;

public class GetReportsScreen {

    private GetReportsScreen(){
    }

    private static GetReportsScreen singleInstance = new GetReportsScreen();
    public static GetReportsScreen getInstance() { return singleInstance; }

    private void getEmployeeReports(boolean toClear){
        if(toClear){
            Utility.getInstance().clearTerminal();
            Utility.getInstance().printHeader();
        }

        System.out.println("LIST OF COACHES:");
        for(Employee e : Core.getInstance().getOtherEmployees()){
            if(e.getEmployeeType().equals("Coach")){
                System.out.println(e);;
            }
        }

        System.out.println("LIST OF PLAYERS:");
        for(Player p : Core.getInstance().getPlayerList()){
            System.out.println(p);
        }

        System.out.println("LIST OF GENERAL SERVICES EMPLOYEES:");
        for(Employee e : Core.getInstance().getOtherEmployees()){
            if(!e.getEmployeeType().equals("Coach")){
                System.out.printf("\tJob: %s\n", e.getEmployeeType());
                System.out.println(e);
            }
        }

    }

    private void getPhysicalResourcesReports(boolean toClear){

    }

    private void getSupportersReports(boolean toClear){
        if(toClear){
            Utility.getInstance().clearTerminal();
            Utility.getInstance().printHeader();
        }

        System.out.println("LIST OF SUPPORTERS:");
        for(Supporter s : Core.getInstance().getSupportersList()){
            System.out.println(s);
        }

        int amountSupporter = Core.getInstance().getSupportersList().size();
        int defaulterCounter = 0, defaultingCounter = 0;

        for(Supporter s : Core.getInstance().getSupportersList()){
            if(s.getPaymentStatus().equals("DEFAULTER")){
                defaulterCounter++;
            }
            if(s.getPaymentStatus().equals("DEFAULTING")){
                defaultingCounter++;
            }
        }

        System.out.println();
        System.out.printf("There are: %d Supporters, where %d are defaulters and %d are defaulting", amountSupporter, defaulterCounter, defaultingCounter);

    }

    private void getAllReports(){
        Utility.getInstance().clearTerminal();
        Utility.getInstance().printHeader();

        System.out.println("ISOCCER ALL REPORTS:");
        System.out.println();

        this.getEmployeeReports(false);
        System.out.println();

        this.getPhysicalResourcesReports(false);
        System.out.println();

        this.getSupportersReports(false);
        System.out.println();

    }

    public void startGetReportsScreen(){
        while(true){
            try{
                Utility.getInstance().printHeader();

                System.out.println("0 - Report about employee");
                System.out.println("1 - Report about physycal resources");
                System.out.println("2 - Report about supporters");
                System.out.println("3 - All together");
                System.out.println("4 - Exit");

                int choosedNumber = Utility.getInstance().getInputScanner().nextInt();

                switch (choosedNumber){
                    case 0:
                        this.getEmployeeReports(true);
                        Utility.getInstance().getInputScanner().nextLine();
                        break;
                    case 1:
                        this.getPhysicalResourcesReports(true);
                        Utility.getInstance().getInputScanner().nextLine();
                        break;
                    case 2:
                        this.getSupportersReports(true);
                        Utility.getInstance().getInputScanner().nextLine();
                        break;
                    case 3:
                        this.getAllReports();
                        Utility.getInstance().getInputScanner().nextLine();
                        break;
                    case 4:
                        return;
                    default:
                        return;
                }
            } catch (Exception e){
                Utility.getInstance().printError("Try again", e);
            }
        }
    }
}
