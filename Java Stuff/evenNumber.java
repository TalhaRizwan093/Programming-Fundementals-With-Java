package com.company;

public class evenNumber {
    public static void main(String[] args) {
        int i;
        for ( i = 1; i<=100 ; i++){
            if (i%2 != 0){
                continue;
            }
            System.out.print(i+ " ");
        }
        i = 1;
        System.out.println(" ");
        while (i<=100){

            i++;
            if (i%2 != 0){
                continue;
            }
            System.out.print(i+ " ");


        }
        i = 1;
        System.out.println(" ");
        do{

            i++;
            if (i%2 != 0){
                continue;
            }
            System.out.print(i+ " ");


        }while(i<=100);
    }
}
