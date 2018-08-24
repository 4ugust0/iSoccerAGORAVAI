package com.company.screens;

import com.company.system.Core;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class AddEmployeeScreen {

    private AddEmployeeScreen(){
    }

    private static AddEmployeeScreen singleInstance = new AddEmployeeScreen();
    public static AddEmployeeScreen getInstance() { return singleInstance; }


    private void addOtherEmployee(String employeeType){
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
        System.out.print("Type the salary: ");
        double monthlySalary = new Scanner(System.in).nextDouble();

        if(cpfNumber.matches("[0-9]{11}") && phoneNumber.matches("[0-9]{9}")){
            Core.getInstance().addOtherEmployee(fullName, eMail, cpfNumber, phoneNumber, monthlySalary, employeeType);
        } else {
            System.out.println("Invalid input, try again");
            new Scanner(System.in).nextLine();
        }
    }

    private void addDoctorEmployee(){
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
        System.out.print("Type the salary: ");
        double monthlySalary = new Scanner(System.in).nextDouble();
        System.out.print("Type the crm number: ");
        String crmNumber = new Scanner(System.in).nextLine();

        if(cpfNumber.matches("[0-9]{11}") && phoneNumber.matches("[0-9]{9}") && crmNumber.matches("[0-9]{5}")){
            Core.getInstance().addDoctor(fullName, eMail, cpfNumber, phoneNumber, monthlySalary, crmNumber);
        } else {
            System.out.println("Invalid input, try again");
            new Scanner(System.in).nextLine();
        }
    }

    private void addDriverEmployee(){
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
        System.out.print("Type the salary: ");
        double monthlySalary = new Scanner(System.in).nextDouble();
        System.out.print("Type the cnh number: ");
        String cnhNumber = new Scanner(System.in).nextLine();

        if(cpfNumber.matches("[0-9]{11}") && phoneNumber.matches("[0-9]{9}") && cnhNumber.matches("[0-9]{11}")){
            Core.getInstance().addDriver(fullName, eMail, cpfNumber, phoneNumber, monthlySalary, cnhNumber);
        } else {
            System.out.println("Invalid input, try again");
            new Scanner(System.in).nextLine();
        }
    }

    private void addPlayerEmployee(){
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
        System.out.print("Type the salary: ");
        double monthlySalary = new Scanner(System.in).nextDouble();
        System.out.print("Type the player type: ");
        String playerType = new Scanner(System.in).nextLine();

        if(cpfNumber.matches("[0-9]{11}") && phoneNumber.matches("[0-9]{9}")
                && playerType.matches("MIDFIELDER|DEFENDER|STRIKER|GOALKEEPER|FULLBACK|RIGHTBACK|LEFTBACK")){
            Core.getInstance().addPlayer(fullName, eMail, cpfNumber, phoneNumber, monthlySalary, playerType);
        } else {
            System.out.println("Invalid input, try again");
            new Scanner(System.in).nextLine();
        }
    }

    public void startAddEmployeeScreen(){
        boolean inMain = true;

        while(inMain){
            try {
                for(int i = 0; i < 100; ++i) System.out.println();

                System.out.println("--- ISOCCER ---");
                System.out.println();

                System.out.println("0 - Add president");
                System.out.println("1 - Add doctor");
                System.out.println("2 - Add coach");
                System.out.println("3 - Add personal");
                System.out.println("4 - Add driver");
                System.out.println("5 - Add cooker");
                System.out.println("6 - Add lawyer");
                System.out.println("7 - Add player");
                System.out.println("8 - Exit");

                int choosedNumber = new Scanner(System.in).nextInt();

                switch (choosedNumber){
                    case 0:
                        this.addOtherEmployee("President");
                        break;
                    case 1:
                        this.addDoctorEmployee();
                        break;
                    case 2:
                        this.addOtherEmployee("Coach");
                        break;
                    case 3:
                        this.addOtherEmployee("Personal");
                        break;
                    case 4:
                        this.addDriverEmployee();
                        break;
                    case 5:
                        this.addOtherEmployee("Cooker");
                        break;
                    case 6:
                        this.addOtherEmployee("Lawyer");
                        break;
                    case 7:
                        this.addPlayerEmployee();
                        break;
                    case 8:
                        return;
                    default:
                        return;
                }

            } catch (Exception e) {
                System.out.println("Try again");
                new Scanner(System.in).nextLine();
            }
        }
    }
}
