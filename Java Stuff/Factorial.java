package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        int fact = 1;
        int num;
        System.out.println("Enter number to calculate factorial of: ");
        num = scan.nextInt();
        for ( int i = 1; i<=num; i++){
            fact =fact*i;
        }
        System.out.println("Factorial of the number is: "+ fact);
    }
}
