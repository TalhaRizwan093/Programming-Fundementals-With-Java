package com.company;

import java.util.Scanner;

public class check {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        int rem,sum,temp,number;
        int n = 1;


        while(n != 0){
            System.out.println("Enter number to check: ");
            rem = 0;
            sum = 0;
            number = scan.nextInt();
            temp = number;
            while (number!=0){
                rem = number%10;
                sum = (sum*10)+rem;
                number = number/10;

            }
            if (sum == temp){
                System.out.println("Number is Palindrom");
            }
            else
                System.out.println("Number is not palindrom");
            System.out.println("If you want to check anyother string press 1 else press 0:");
            n = scan.nextInt();


        }
    }
}
