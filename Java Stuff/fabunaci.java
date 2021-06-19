package com.company;

import java.util.Scanner;

public class fabunaci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n;
        int n1 = 0, n2 = 1;
        System.out.println("Enter the number of terms you want to see");
        n = scan.nextInt();
        int sum = 0;
        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(n1 + " + ");

            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
    }
}

