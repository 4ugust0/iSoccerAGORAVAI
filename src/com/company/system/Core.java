package com.company.system;

import com.company.models.*;
import com.company.util.Utility;

import java.util.ArrayList;
import java.util.EnumMap;

public class Core {

    private Core(){
        this.playerList = new ArrayList<Player>();
        this.doctorList = new ArrayList<Doctor>();
        this.driverList = new ArrayList<Driver>();
        this.otherEmployees = new ArrayList<Employee>();
        this.supportersList = new ArrayList<Supporter>();

        this.juniorValue = 1000.0;
        this.seniorValue = 2000.0;
        this.eliteValue = 3000.0;
    }

    private static Core singleInstance = new Core();
    public static Core getInstance() { return singleInstance; }

    private ArrayList<Player> playerList;
    private ArrayList<Doctor> doctorList;
    private ArrayList<Driver> driverList;
    private ArrayList<Employee> otherEmployees;
    private ArrayList<Supporter> supportersList;

    public ArrayList<Player> getPlayerList() {
        return playerList;
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public ArrayList<Driver> getDriverList() {
        return driverList;
    }

    public ArrayList<Employee> getOtherEmployees() {
        return otherEmployees;
    }

    public ArrayList<Supporter> getSupportersList() {
        return supportersList;
    }

    private double juniorValue;
    private double seniorValue;
    private double eliteValue;

    public double getJuniorValue() {
        return juniorValue;
    }

    public void setJuniorValue(double juniorValue) {
        this.juniorValue = juniorValue;
    }

    public double getSeniorValue() {
        return seniorValue;
    }

    public void setSeniorValue(double seniorValue) {
        this.seniorValue = seniorValue;
    }

    public double getEliteValue() {
        return eliteValue;
    }

    public void setEliteValue(double eliteValue) {
        this.eliteValue = eliteValue;
    }

    public void addPlayer(Employee employeeTemplate, String playerType){
        Player newPlayer = new Player(
                employeeTemplate.getFullName(),
                employeeTemplate.geteMail(),
                employeeTemplate.getCpfNumber(),
                employeeTemplate.getPhoneNumber(),
                employeeTemplate.getMonthlySalary(),
                playerType);
        this.playerList.add(newPlayer);
    }

    public void addDoctor(Employee employeeTemplate, String crmNumber){
        Doctor newDoctor = new Doctor(
                employeeTemplate.getFullName(),
                employeeTemplate.geteMail(),
                employeeTemplate.getCpfNumber(),
                employeeTemplate.getPhoneNumber(),
                employeeTemplate.getMonthlySalary(),
                crmNumber);
        this.doctorList.add(newDoctor);
    }

    public void addDriver(Employee employeeTemplate, String cnhNumber){
        Driver newDriver = new Driver(
                employeeTemplate.getFullName(),
                employeeTemplate.geteMail(),
                employeeTemplate.getCpfNumber(),
                employeeTemplate.getPhoneNumber(),
                employeeTemplate.getMonthlySalary(),
                cnhNumber);
        this.driverList.add(newDriver);
    }

    public void addOtherEmployee(Employee employeeTemplate, String employeeType){
        Employee newEmployee = new Employee(
                employeeTemplate.getFullName(),
                employeeTemplate.geteMail(),
                employeeTemplate.getCpfNumber(),
                employeeTemplate.getPhoneNumber(),
                employeeTemplate.getMonthlySalary(),
                employeeType);
        this.otherEmployees.add(newEmployee);
    }

    public void addSupporter(String fullName, String eMail, String cpfNumber, String phoneNumber, String supporterType){
        Supporter newSupporter = new Supporter(fullName, eMail, cpfNumber, phoneNumber, supporterType);
        this.supportersList.add(newSupporter);
    }

    public void switchPlayerDisponibility(String cpfNumber){
        if(cpfNumber.matches("[0-9]{11}")){
            for(Player p : this.playerList){
                if(p.getCpfNumber().equals(cpfNumber)){
                    p.setAble(!p.isAble());
                }
            }
        } else{
            Utility.getInstance().printError("Invalid cpf number, try again");
        }
    }
}
