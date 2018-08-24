package com.company.models;

public class Employee extends Person {

    public Employee(String fullName, String eMail, String cpfNumber, String phoneNumber, double monthlySalary){
        super(fullName, eMail, cpfNumber, phoneNumber);

        this.monthlySalary = monthlySalary;
        this.employeeType = null;
    }

    public Employee(String fullName, String eMail, String cpfNumber, String phoneNumber, double monthlySalary, String employeeType){
        super(fullName, eMail, cpfNumber, phoneNumber);

        this.monthlySalary = monthlySalary;
        this.employeeType = employeeType;
    }

    private double monthlySalary;
    private String employeeType;

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    @Override
    public String toString(){
        return super.toString() + "\tSalary: " + this.monthlySalary + "\n";
    }
}
