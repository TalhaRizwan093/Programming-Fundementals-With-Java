package com.company;

import java.util.Scanner;

public class stringTask6 {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        char n = 'y';
        int num1;
        String s2 = "";

        while (n != 'n') {
            System.out.println("Enter Number to check: ");
            num1 = scan.nextInt();
            String s1 = Integer.toString(num1);

            s2 = "";
            int length = s1.length();
            for (int i = length - 1; i >= 0; i--) {
                s2 = s2 + s1.charAt(i);
            }
            if (s1.equalsIgnoreCase(s2)) {
                System.out.println("Number is Palindrom");
            } else
                System.out.println("Number is not palindrom");
            System.out.println("If you want to check anyother Number press Y else press N:");
            n = scan.next().charAt(0);
            n = Character.toLowerCase(n);


        }
    }
}
