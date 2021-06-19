package com.company;

import java.util.Scanner;

public class methodsOfScannerObjects {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Byte number: ");
        Byte numByte = scan.nextByte();
        System.out.print("\nEnter Short number: ");
        Short numShort = scan.nextShort();
        System.out.print("\nEnter Int number: ");
        int numInt = scan.nextInt();
        System.out.print("\nEnter Long number: ");
        long numLong = scan.nextLong();
        System.out.print("\nEnter float number: ");
        float numFloat = scan.nextFloat();
        System.out.print("\nEnter Double number: ");
        double numDouble = scan.nextDouble();




    }
}
