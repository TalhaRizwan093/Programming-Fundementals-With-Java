package com.company;

import java.util.Scanner;

public class CtoF {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius°: ");
        float tempCel = scan.nextFloat();
        float tempF = (tempCel * 9/5) + 32;
        System.out.println(tempCel + "° Celsius to Fahrenheit is " + tempF + "°");
    }
}
