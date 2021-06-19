package com.company;

public class task {
    public static void main (String args[]){
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        for (int i = 1;i<= 10 ; i++){
            sum1 = sum1 + i;
        }
        for (int j = 20;j<= 37 ; j++){
            sum2 = sum2 + j;
        }
        for (int k = 35;k<= 49 ; k++){
            sum3 = sum3 + k;
        }
        System.out.println("Sum from 1 to 10:"+sum1);
        System.out.println("Sum from 20 to 37:"+sum2);
        System.out.println("Sum from 35 to 49:"+sum3);
    }
}
