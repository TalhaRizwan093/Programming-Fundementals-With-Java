package com.company;

public class pattern3 {
    public static void main (String args[]){
        int rows = 4;
        for (int i = 0; i<rows ; i++){
            for(int space = rows-i; space>1 ; space--){
                System.out.print(" ");
            }
            for(int j = 0 ; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println("");

        }
    }
}
