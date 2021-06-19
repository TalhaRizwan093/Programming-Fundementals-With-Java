package com.company;

import java.util.Scanner;

public class wholeNumbersAverage {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The first Whole Number: ");
        int firstWholeNumber = scan.nextInt();
        System.out.print("Enter The second Whole Number: ");
        int secondWholeNumber = scan.nextInt();
        System.out.print("Enter The third Whole Number: ");
        int thirdWholeNumber = scan.nextInt();
        int sum = firstWholeNumber + secondWholeNumber + thirdWholeNumber;
        float average = (float) sum/3;
        System.out.printf("Average of three whole numbers is: " + average);

    }
}
