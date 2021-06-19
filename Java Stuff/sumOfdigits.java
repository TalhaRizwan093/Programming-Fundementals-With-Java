package com.company;

import java.util.Scanner;

public class sumOfdigits {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        int num,sum = 0 ,rem;
        System.out.println("Enter the number: ");
        num = scan.nextInt();
        while(num != 0){
            rem = num % 10;
            sum = sum + rem;
            num = num/10;

        }
        System.out.println("Sum of digits is : "+sum);
    }
}
