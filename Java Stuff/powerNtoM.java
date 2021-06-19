package com.company;

import java.util.Scanner;

public class powerNtoM {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        int base,pow;
        int ans = 1;
        System.out.println("Enter Base number: ");
        base = scan.nextInt();
        System.out.println("Enter power number: ");
        pow = scan.nextInt();
        for (int i = 1; i<=pow ; i++){
            ans = ans*base;
        }
        System.out.println("Answer is: "+ ans);
    }
}
