package com.company;

import java.util.Scanner;

public class lcm {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        int num1, num2,lcm;
        System.out.println("Enter first number: ");
        num1 = scan.nextInt();
        System.out.println("Enter second number: ");
        num2 = scan.nextInt();
        if (num1 > num2)
            lcm = num1;
        else
            lcm = num2;
        while(num1!=0){
            if(lcm % num1 == 0 && lcm % num2 == 0 ){
                System.out.println("LCM of two numbers is: "+ lcm);
                break;
            }
            lcm++;

        }

    }
}
