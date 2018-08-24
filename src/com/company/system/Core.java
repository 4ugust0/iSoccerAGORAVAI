package com.company.system;

import com.company.models.*;

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

    public void addPlayer(String fullName, String eMail, String cpfNumber, String phoneNumber, double monthlySalary, String playerType){
        Player newPlayer = new Player(fullName, eMail, cpfNumber, phoneNumber, monthlySalary, playerType);
        this.playerList.add(newPlayer);
    }

    public void addDoctor(String fullName, String eMail, String cpfNumber, String phoneNumber, double monthlySalary, String crmNumber){
        Doctor newDoctor = new Doctor(fullName, eMail, cpfNumber, phoneNumber, monthlySalary, crmNumber);
        this.doctorList.add(newDoctor);
    }

    public void addDriver(String fullName, String eMail, String cpfNumber, String phoneNumber, double monthlySalary, String cnhNumber){
        Driver newDriver = new Driver(fullName, eMail, cpfNumber, phoneNumber, monthlySalary, cnhNumber);
        this.driverList.add(newDriver);
    }

    public void addOtherEmployee(String fullName, String eMail, String cpfNumber, String phoneNumber, double monthlySalary, String employeeType){
        Employee newEmployee = new Employee(fullName, eMail, cpfNumber, phoneNumber, monthlySalary, employeeType);
        this.otherEmployees.add(newEmployee);
    }

    public void addSupporter(String fullName, String eMail, String cpfNumber, String phoneNumber, String supporterType){
        Supporter newSupporter = new Supporter(fullName, eMail, cpfNumber, phoneNumber, supporterType);
        this.supportersList.add(newSupporter);
    }
}
