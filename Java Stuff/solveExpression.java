package com.company;

import java.util.Scanner;

public class solveExpression {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        int a,b,c,d,r;
        System.out.println("Enter values of a,b,c,d and r to solve the equeation:");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();
        r = scan.nextInt();
        float sol;
        sol = (float) 4 /(3 * (r + 34)) - 9 * (a + b * c) + (3 + d * (2 + a))/(a + (b * d));
        System.out.println("Solution of the expression is: " + sol);

    }
}
