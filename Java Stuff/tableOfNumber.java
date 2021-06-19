package com.company;

import java.util.Scanner;

public class tableOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,i;
        System.out.println("Which table you want: ");
        n = scan.nextInt();
        System.out.println("With fot loop");
        for (i = 1 ; i<= 10 ; i++){
            System.out.println(n + "*" + i + "=" + i*n);
        }
        System.out.println("With while loop");
        i = 1;
        while (i<=10){
            System.out.println(n + "*" + i + "=" + i*n);
            i++;

        }
        System.out.println("With Do while loop");
        i = 1;
        do{
            System.out.println(n + "*" + i + "=" + i*n);
            i++;
        }while(i<=10);

    }
}
