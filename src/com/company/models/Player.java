package com.company.models;

public class Player extends Employee{

    public Player(String fullName, String eMail, String cpfNumber, String phoneNumber, double monthlySalary, String playerType){
        super(fullName, eMail, cpfNumber, phoneNumber, monthlySalary);

        this.playerType = playerType;
        this.isAble = true;
    }

    private String playerType;
    private boolean isAble;

    public String getPlayerType() {
        return this.playerType;
    }

    public boolean isAble() {
        return this.isAble;
    }

    @Override
    public String toString(){
        return super.toString() + "\tPlayer type: " + this.playerType + "\n" +
                "\tIs able to play: " + ((this.isAble())?("YES"):("NO")) + "\n";
    }
}
