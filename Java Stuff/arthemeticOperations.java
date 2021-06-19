package com.company;

import java.util.Scanner;
import java.util.SortedMap;

public class arthemeticOperations {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int firstNumber = scan.nextInt();
        System.out.print("Enter Second number: ");
        int secondNumber = scan.nextInt();

        //Addition


        System.out.print("\nSum: "+ (firstNumber + secondNumber));

        //Subtraction

        System.out.print("\nSubtraction: " + (firstNumber-secondNumber));

        // Multiplication

        System.out.print("\nMutltiplication: " + (firstNumber * secondNumber));

        // Division

        System.out.print("\nDivision: " + ((float) firstNumber / secondNumber));

        //Modulus

        System.out.print("\nReminder: " + (firstNumber % secondNumber));



    }
}
