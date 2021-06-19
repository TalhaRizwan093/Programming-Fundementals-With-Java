package com.company;

import java.util.Scanner;

public class METHOD {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        float numbers;
        System.out.println("Enter your numbers: ");
        numbers = scan.nextFloat();
        System.out.println("Your grade is:" + getgrade(numbers));
    }
    public static String getgrade(float number){
        if (number >= 90.0){
            return "A";

        }
        else if (number >= 80.0){
            return "B";
        }
        else if (number >= 70.0){
            return "c";

        }
        else if(number < 0 || number > 100) {

            return "Invailid";
        }
        else
            return "F";




    }

}

