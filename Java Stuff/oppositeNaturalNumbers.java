package com.company;

import java.util.Scanner;

public class oppositeNaturalNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Please enter the limit of natural numbers: ");
        n = scan.nextInt();
        for (int i = n ; i>= 1 ; i--){
            System.out.println(i);
        }
    }

}
