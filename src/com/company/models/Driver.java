package com.company.models;

public class Driver extends Employee {

    public Driver(String fullName, String eMail, String cpfNumber, String phoneNumber, double monthlySalary, String cnhNumber) {
        super(fullName, eMail, cpfNumber, phoneNumber, monthlySalary);

        this.cnhNumber = cnhNumber;
    }

    private String cnhNumber;

    @Override
    public String toString(){
        return super.toString() + "\tCNH: " + this.cnhNumber + "\n";
    }
}
