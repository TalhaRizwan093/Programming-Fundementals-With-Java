package com.company;

import java.util.Scanner;

public class array {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        int N, M;
        System.out.println("Enter Length of Array 1: ");
        N = scan.nextInt();
        System.out.println("Enter Length of Array 2: ");
        M = scan.nextInt();
        int[] array_1 = new int[N];
        int[] array_2 = new int[M];
        int[] array_3 = new int[N+M];

        for (int i=0; i< array_1.length; i++){
            System.out.println("Enter number of array 1 at location:" + i);
            array_1[i] = scan.nextInt();
        }

        for (int i=0; i< array_2.length; i++){
            System.out.println("Enter number of array 2 at location:" + i);
            array_2[i] = scan.nextInt();
        }
        array_3 = combine(array_1,array_2);
        for (int k = 0 ;k< array_3.length;k++){
            System.out.print(" " + array_3[k]);
        }

    }

    public static int[] combine(int[] a1,int[] a2){
        int n = a1.length + a2.length;
        int[] result = new int[n];
        for (int i=0; i< a1.length;i++){
            result[i] = a1[i];

        }
        int k = 0;
        for (int j= n- a1.length ; j< result.length; j++){

            result[j] = a2[k];
            k++;
        }

        return result;


    }
}
