package com.company.screens;

import com.company.models.Employee;
import com.company.system.Core;
import com.company.util.Utility;

import javax.annotation.processing.SupportedSourceVersion;
import javax.rmi.CORBA.Util;
import java.util.Scanner;

public class AddEmployeeScreen {

    private AddEmployeeScreen(){
    }

    private static AddEmployeeScreen singleInstance = new AddEmployeeScreen();
    public static AddEmployeeScreen getInstance() { return singleInstance; }

    private Employee generateEmployeeTemplate(){
        try {
            Utility.getInstance().printHeader();

            System.out.print("Type the full name: ");
            String fullName = Utility.getInstance().getInputScanner().nextLine();
            System.out.print("Type the email: ");
            String eMail = Utility.getInstance().getInputScanner().nextLine();
            System.out.print("Type the cpf number: ");
            String cpfNumber = Utility.getInstance().getInputScanner().nextLine();
            System.out.print("Type the phone number: ");
            String phoneNumber = Utility.getInstance().getInputScanner().nextLine();
            System.out.print("Type the monthly salary: ");
            double monthlySalary = Utility.getInstance().getInputScanner().nextDouble();

            if(cpfNumber.matches("[0-9]{11}") && phoneNumber.matches("[0-9]{9}")){
                return new Employee(fullName, eMail, cpfNumber, phoneNumber, monthlySalary);
            } else {
                Utility.getInstance().printError("Invalid input, try again");
            }

        } catch(Exception e){
            Utility.getInstance().printError("Invalid input, try again", e);
        }

        return null;
    }

    private void addOtherEmployee(String employeeType){
        try{
            Employee employeeTemplate = this.generateEmployeeTemplate();

            employeeTemplate.setEmployeeType(employeeType);
            Core.getInstance().addOtherEmployee(employeeTemplate, employeeType);
        } catch (Exception e){
            Utility.getInstance().printError("Something gone wrong, try again", e);
        }
    }

    private void addDoctorEmployee(){
        try{
            Employee employeeTemplate = this.generateEmployeeTemplate();

            System.out.print("Type the crm number: ");
            String crmNumber = Utility.getInstance().getInputScanner().nextLine();

            if(crmNumber.matches("[0-9]{5}")){
                Core.getInstance().addDoctor(employeeTemplate, crmNumber);
            } else{
                Utility.getInstance().printError("Invalid input, try again");
            }
        } catch (Exception e){
            Utility.getInstance().printError("Invalid input, try again", e);
        }
    }

    private void addDriverEmployee(){
        try{
            Employee employeeTemplate = this.generateEmployeeTemplate();

            System.out.print("Type the cnh number: ");
            String cnhNumber = Utility.getInstance().getInputScanner().nextLine();
            
            if(cnhNumber.matches("[0-9]{11}")){
                Core.getInstance().addDriver(employeeTemplate, cnhNumber);
            } else{
                Utility.getInstance().printError("Invalid input, try again");
            }
        } catch (Exception e){
            Utility.getInstance().printError("Invalid input, try again", e);
        }
    }

    private void addPlayerEmployee(){
        try{
            Employee employeeTemplate = this.generateEmployeeTemplate();

            System.out.print("Type the player type: ");
            String playerType = Utility.getInstance().getInputScanner().nextLine();

            if(playerType.matches("MIDFIELDER|DEFENDER|STRIKER|GOALKEEPER|FULLBACK|RIGHTBACK|LEFTBACK")){
                Core.getInstance().addPlayer(employeeTemplate, playerType);
            } else{
                Utility.getInstance().printError("Invalid input, try again");
            }
        } catch (Exception e){
            Utility.getInstance().printError("Invalid input, try again", e);
        }
    }
    
    public void startAddEmployeeScreen(){
        while(true) {
            try {
                Utility.getInstance().printHeader();

                System.out.println("0 - Add president");
                System.out.println("1 - Add doctor");
                System.out.println("2 - Add coach");
                System.out.println("3 - Add personal");
                System.out.println("4 - Add driver");
                System.out.println("5 - Add cooker");
                System.out.println("6 - Add lawyer");
                System.out.println("7 - Add player");
                System.out.println("8 - Exit");

                int choosedNumber = Utility.getInstance().getInputScanner().nextInt();

                switch (choosedNumber) {
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
                Utility.getInstance().printError("Try again", e);
            }
        }
    }
}
