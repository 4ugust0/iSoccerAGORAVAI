package com.company.models;

public class Person {

    public Person(String fullName, String eMail, String cpfNumber, String phoneNumber){
        this.fullName = fullName;
        this.eMail = eMail;
        this.cpfNumber = cpfNumber;
        this.phoneNumber = phoneNumber;
    }

    private String fullName;
    private String eMail;
    private String cpfNumber;
    private String phoneNumber;

    public String getFullName() {
        return fullName;
    }

    public String geteMail() {
        return eMail;
    }

    public String getCpfNumber() {
        return cpfNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString(){
        return "\tFull name: " + this.fullName + "\n" +
                "\tEmail: " + this.eMail + "\n" +
                "\tCPF: " + this.cpfNumber + "\n" +
                "\tPhone: " + this.phoneNumber + "\n";
    }

}
