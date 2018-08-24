package com.company.models;

public class Doctor extends Employee {

    public Doctor(String fullName, String eMail, String cpfNumber, String phoneNumber, double monthlySalary, String crmNumber){
        super(fullName, eMail, cpfNumber, phoneNumber, monthlySalary);

        this.crmNumber = crmNumber;
    }

    private String crmNumber;

    @Override
    public String toString(){
        return super.toString() + "\tCRM: " + this.crmNumber + "\n";
    }
}
