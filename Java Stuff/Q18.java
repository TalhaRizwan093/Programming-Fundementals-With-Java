package com.company;

import java.util.Scanner;

public class Q18 {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        int num1, num2, vali , vald;
        System.out.println("Enter value 1 and value 2 to perform increment decrement operation");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        vali = num1++;
        vald = num2--;
        System.out.println("num1 and num2 are incremented and decreemented but vali and vald will get the old value because of post increment decrement so:");
        System.out.println("Value of vali is: "+ vali + " But vlaue of num1 is " + num1);
        System.out.println("Value of vali is: "+ vald + " But vlaue of num1 is " + num2);
        vali = ++num1;
        vald = --num2;
        System.out.println("num1 and num2 are incremented and decreemented and vali and vald will get the new value because of pre increment decrement so:");
        System.out.println("Value of vali is: "+ vali + " and vlaue of num1 is " + num1);
        System.out.println("Value of vali is: "+ vald + " and vlaue of num1 is " + num2);


    }
}
