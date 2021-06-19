package com.company;

import java.util.Scanner;
import java.util.*;


public class numberOfNotes {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int amount, num_5000, num_1000, num_500 , num_100 , num_50 , num_10 ,num_5 , num_1;
        System.out.println("Enter total amount of 5 digits only");
        amount = scan.nextInt();
        num_5000 = amount/5000;
        int temp = amount - (num_5000 * 5000) ;
        System.out.println("Number of 5000 notes: " + num_5000);
        if (temp >= 1000){
            num_1000 = temp/1000;
            temp = temp - (num_1000 * 1000 );
            System.out.println("Number of 1000 notes: " + num_1000);

        }
        if (temp >= 500){
            num_500 = temp/500;
            temp = temp - (num_500 * 500) ;
            System.out.println("Number of 500 notes: " + num_500);

        }
        if (temp >= 100){
            num_100 = temp/100;
            temp = temp - (num_100 * 100);
            System.out.println("Number of 100 notes: " + num_100);
        }
        if (temp >= 50){
            num_50 = temp/50;
            temp = temp - (num_50 * 50);
            System.out.println("Number of 50 notes: " + num_50);

        }
        if (temp >= 10){
            num_10 = temp/10;
            temp = temp - (num_10 * 10);
            System.out.println("Number of 10 notes: " + num_10);

        }
        if (temp >= 5){
            num_5 = temp/5;
            temp = temp - (num_5 * 5);
            System.out.println("Number of 5 notes: " + num_5);
        }
        if (temp >= 1){
            num_1 = temp;
            System.out.println("Number of 1 notes: " + num_1);
        }



    }
}
