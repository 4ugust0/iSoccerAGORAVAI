package com.company.models;

import com.company.system.Core;

public class Supporter extends Person {
    public Supporter(String fullName, String eMail, String cpfNumber, String phoneNumber, String supporterType) {
        super(fullName, eMail, cpfNumber, phoneNumber);

        if(supporterType.matches("JUNIOR")) {
            this.contributionValue = Core.getInstance().getJuniorValue();
        }
        if(supporterType.matches("SENIOR")) {
            this.contributionValue = Core.getInstance().getSeniorValue();
        }
        if(supporterType.matches("ELITE")){
            this.contributionValue = Core.getInstance().getEliteValue();
        }

        this.paymentStatus = "DEFAULTER";
        this.supporterType = supporterType;
    }

    private double contributionValue;
    private String paymentStatus;
    private String supporterType;

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void makeDefaulter(){
        this.paymentStatus = "DEFAULTER";
    }

    public void makeDefaulting(){
        this.paymentStatus = "DEFAULTING";
    }

    public void updateSupporterType(){
        if(this.supporterType.matches("JUNIOR")) {
            this.contributionValue = Core.getInstance().getJuniorValue();
        }
        if(this.supporterType.matches("SENIOR")) {
            this.contributionValue = Core.getInstance().getSeniorValue();
        }
        if(this.supporterType.matches("ELITE")){
            this.contributionValue = Core.getInstance().getEliteValue();
        }
    }

    @Override
    public String toString(){
        return super.toString() + "\tContribution Value: " + this.contributionValue + "\n" +
                "\tPayment Status: " + this.paymentStatus + "\n" +
                "\tSupporter Type: " + this.supporterType + "\n";
    }
}
