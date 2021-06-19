package com.company;

import java.util.Scanner;

public class naturalNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Please enter the limit of natural numbers: ");
        n = scan.nextInt();
        for (int i = 0 ; i<= n ; i++){
            System.out.println(i);
        }
    }
}
