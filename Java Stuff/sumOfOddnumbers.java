package com.company;

import java.util.Scanner;

public class sumOfOddnumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter limit:");
        int n = scan.nextInt();
        int sum=0;
        int i = 0;
        do{

            if (i % 2 == 0){
                i++;
                continue;
            }
            sum = sum + i;

            i++;




        }while(i<=n);
        System.out.println("Sum of odd numbers upto n is: " + sum);

    }
}
