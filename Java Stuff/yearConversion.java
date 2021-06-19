package com.company;

import java.util.Scanner;

public class yearConversion {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Seconds for conversion: ");
        float years = scan.nextFloat();
        System.out.printf("\nYears In Months: " + ( years * 12 ));
        System.out.printf("\nYears In Days: " + ( years * 360 ));
        System.out.printf("\nYears In Hours: " + ( years / 86400 ));
        System.out.printf("\nYears In Minutes: " + ( years / 5184000 ));
        System.out.printf("\nYears In Seconds: " + ( years / 31104000 ));




    }
}
