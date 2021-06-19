package com.company;

import java.util.Scanner;

public class assignment2D {
    public static void printPattern(int num){

            if (num > 0  ){

                num = num - 5;
                System.out.print("\t "+num);


                printPattern(num);
                num = num + 5;
                System.out.print("\t "+num);

            }
    }
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the starting number: ");
        n = scan.nextInt();
        System.out.print(n);
        printPattern(n);
    }
}
