package com.company;

import java.util.Scanner;

public class stringTask11 {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        String cnic;
        System.out.println("Please enter your cnic in the formatte of NNNNN-NNNNNNN-N: ");
        cnic = scan.next();
        if (cnic.charAt(5) == '-' && cnic.charAt(13) == '-' && cnic.length() == 15){
            System.out.println("Your intered your cnic in correct format");
        }
        else
            System.out.println("You enetered in wrong format");
    }
}
