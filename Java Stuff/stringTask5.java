package com.company;

import java.util.Scanner;

public class stringTask5 {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        char n = 'y';
        String s1,s2 = "";

        while(n != 'n'){
            System.out.println("Enter string to check: ");
            s1 = scan.next();
            s2 = "";
            int length = s1.length();
            for (int i = length-1; i>=0 ; i--){
                s2 = s2 + s1.charAt(i);
            }
            if (s1.equalsIgnoreCase(s2)){
                System.out.println("String is Palindrom");
            }
            else
                System.out.println("String is not palindrom");
            System.out.println("If you want to check anyother string press Y else press N:");
            n = scan.next().charAt(0);
            n = Character.toLowerCase(n);


        }


    }
}
