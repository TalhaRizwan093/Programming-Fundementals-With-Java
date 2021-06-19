package com.company;

import java.util.Scanner;

public class assignment2C {
    public static int sum (int num){
        if (num<=1)
            return num;
        return num + sum(num-1);
    }
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        int N;
        System.out.println("Enter number to find sum from 1 to N: ");
        N = scan.nextInt();
        int sum;
        sum = sum(N);
        System.out.println("Sum from 1 to "+N+" is "+ sum);


    }
}
