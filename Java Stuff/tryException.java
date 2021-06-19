package com.company;

import java.util.Scanner;

public class tryException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int row,col,num=0;
        System.out.println("Enter number");
        row = scan.nextInt();
        col = scan.nextInt();
        int[][] chairs = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                chairs[i][j] = num;
                num++;
            }
        }
        int a = -1, b = -1;
        if(chairs[a][b] == 1){
            System.out.println("abc");
        }

    }
}
