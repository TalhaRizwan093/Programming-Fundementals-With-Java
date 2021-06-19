package com.company;

import java.util.Scanner;

public class fiveDigitAddition {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 5 Digit Number only: ");
        int number = scan.nextInt();
        int reminder;
        int sum;
        reminder = number % 10;      // Gets the Last digit
        sum = reminder;              // Sum the last digit in Sum variable
        number = number / 10;            // Delete the Last digit
        reminder = number % 10;
        sum = sum + reminder;
        number = number / 10;
        reminder = number % 10;
        sum = sum + reminder;
        number = number / 10;
        reminder = number % 10;
        sum = sum + reminder;
        number = number / 10;
        reminder = number % 10;
        sum = sum + reminder;
        number = number / 10;
        sum = sum + number;
        System.out.print("Sum of digits of 5 numbers is: " + sum);



    }
}
