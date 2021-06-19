package com.company;

import java.util.Scanner;

public class secondsConversion {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Seconds for conversion: ");
        long seconds = scan.nextLong();
        System.out.print("\nSeconds In Minutes: " + ((float) seconds / 60 ));
        System.out.printf("\nSeconds In Hours: " + ((float) seconds / 3600 ));
        System.out.printf("\nSeconds In Days: " + ((float) seconds / 86400 ));
        System.out.printf("\nSecond In Months: " + ((float) seconds / 2592000 ));
        System.out.printf("\nSecond In Years: "+ ((float) seconds / 31104000 ));
    }
}
