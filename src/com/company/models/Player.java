package com.company.models;

import com.company.util.Utility;

public class Player extends Employee{

    public Player(String fullName, String eMail, String cpfNumber, String phoneNumber, double monthlySalary, String playerType){
        super(fullName, eMail, cpfNumber, phoneNumber, monthlySalary);

        this.playerType = playerType;
        this.isAble = true;
    }

    private String playerType;
    private boolean isAble;

    public String getPlayerType() {
        return playerType;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public boolean isAble() {
        return isAble;
    }

    public void setAble(boolean able) {
        isAble = able;
    }

    @Override
    public String toString(){
        return super.toString() + "\tPlayer type: " + this.playerType + "\n" +
                "\tIs able to play: " + ((this.isAble())?("YES"):("NO")) + "\n";
    }

}
