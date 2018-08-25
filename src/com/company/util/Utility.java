package com.company.util;

import java.util.Scanner;

public class Utility {
    private Utility() { }

    public Scanner getInputScanner() {
        return new Scanner(System.in);
    }

    private Scanner inputScanner;

    private static Utility singleInstance = new Utility();
    public static Utility getInstance() { return singleInstance; }

    public void clearTerminal(){
        for(int i = 0; i < 100; ++i){
            System.out.println();
        }
    }

    public void printHeader(){
        System.out.println("--- ISOCCER ---");
        System.out.println();
    }

    public void printError(String errorMessage){
        System.out.println();
        System.out.println(errorMessage);
        System.out.println();

        this.inputScanner.nextLine();
    }

    public void printError(String errorMessage, Exception e){
        System.out.println();
        System.out.println(errorMessage);
        System.out.println();
        e.printStackTrace();
        System.out.println();

        this.inputScanner.nextLine();
    }
}
