package com.company;


import java.util.Scanner;

public class twoDimensionalArray {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int row, col, num = 2,turn = 0;
        System.out.println("Enter rows and columns of chairs: ");
        row = scan.nextInt();
        col = scan.nextInt();
        int[][] chairs = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                chairs[i][j] = num;
                num++;
            }
        }


        int a_row, a_col;
        System.out.println("ENter location of ali: ");
        a_row = scan.nextInt();
        a_col = scan.nextInt();

        chairs[a_row - 1][a_col - 1] = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(chairs[i][j] + " ");
            }
            System.out.println(" ");
        }

        int box_row, box_col;
        System.out.println("Enter location of choclate box only in cornor: ");
        box_row = scan.nextInt()-1 ;
        box_col = scan.nextInt()-1;

        chairs[box_row][box_col] = 1;


        while (true) {
        //For top left cornor
        try{
            if(chairs[box_row][box_col+1] != 1){
                box_col = box_col + 1;
                chairs[box_row][box_col] = 1;

                if(turn == 1){
                    box_row += 1;
                }
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        System.out.print(chairs[i][j] + " ");
                    }
                    System.out.println(" ");
                }
                turn ++;
                continue;


            }

        }
        catch(ArrayIndexOutOfBoundsException e){

        }

        try{
            if(chairs[box_row][box_col] != 1){



                chairs[box_row][box_col] = 1;
                box_col = box_col - 1;

                System.out.println(box_col+ " " + box_row);
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        System.out.print(chairs[i][j] + " ");
                    }
                    System.out.println(" ");
                }
                turn++;
                if(turn == 5){
                    box_row += 1;
                }



                continue;
            }

        }
        catch(ArrayIndexOutOfBoundsException e){

        }


        try{
            if(chairs[box_row][box_col+1] != 1){
                box_col = box_col + 1;
                chairs[box_row][box_col] = 1;
                turn ++;
                if(turn == 2){
                    box_row += 1;
                }
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        System.out.print(chairs[i][j] + " ");
                    }
                    System.out.println(" ");
                }
                continue;


                }

            }
            catch(ArrayIndexOutOfBoundsException e){

            }

        //for top right cornor
        try{
            if(chairs[box_row][box_col-1] != 1){
                box_col = box_col-1;
                chairs[box_row][box_col-1] = 1;
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        System.out.print(chairs[i][j] + " ");
                    }
                    System.out.println(" ");
                }
                continue;

            }

        }
        catch(ArrayIndexOutOfBoundsException e){

        }
        /*try {
            if(chairs[box_row-1][box_col-1] != 1){
                chairs[box_row-1][box_col-2] = 1;
                box_col--;
            }

        }
        catch(ArrayIndexOutOfBoundsException e){

        }
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(chairs[i][j] + " ");
                }
                System.out.println(" ");
            }


         */


        }

    }


    /*public static int check (int[][] chair, int box_r ,int box_c){
        int turn=0;
        if(turn < 3 ){
            if(chair[box_r][box_c+1] != 1){
                box_c = box_c+1;
                chair[box_r][box_c] = 1;
                return box_c;

            }
            else if(chair[box_r+1][box_c] != 1){
                box_c = box_c - 1;
                chair[box_r][box_c] = 1;

                System.out.println("b");
                return box_c;
            }

        }

        return box_c;


    }

     */
}


