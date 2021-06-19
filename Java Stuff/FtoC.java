package com.company;

import java.util.Scanner;

public class FtoC {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter temperature in fahrenheit°: ");
        float tempF = scan.nextFloat();
        float tempCel = (tempF - 32) * 5/9;
        System.out.println(tempF + "° Fahrenheit to Celsius is " + tempCel +"°");
    }
}
