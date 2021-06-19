package com.company;

import java.util.Scanner;

public class circleArea {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius:");
        int radius = scanner.nextInt();
        final float pi = 3.14f;
        System.out.print("\nArea of circle is: " + pi*radius*radius);




    }
}
