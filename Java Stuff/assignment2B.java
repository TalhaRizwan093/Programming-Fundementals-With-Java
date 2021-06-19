package com.company;

import java.util.Scanner;

public class assignment2B {
    public static int add (int n1, int n2){
        if (n2 == 0){
            return n1;
        }
        int sum;
        sum = add(n1, n2-1) + 1;
        return sum;
    }
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        int num1,num2,sum;
        System.out.println("Enter first number: ");
        num1 = scan.nextInt();
        System.out.println("Enter first number: ");
        num2 = scan.nextInt();
        sum = add(num1,num2);
        System.out.println("Sum of two numbers is: "+ sum);

    }
}
