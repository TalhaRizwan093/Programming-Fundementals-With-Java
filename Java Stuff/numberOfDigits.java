package com.company;

import java.util.Scanner;

public class numberOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int n = scan.nextInt();
        int count = 0;
        while (n%10 != 0){
            n = n/10;
            count++;

        }
        System.out.println("Number of digits in your number is: " + count);

    }
}
