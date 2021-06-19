package com.company;

import java.util.Scanner;

public class assignment4 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int row, col, num = 2, turn = 0;
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
        System.out.println("Enter location of ali: ");
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
        box_row = scan.nextInt() - 1;
        box_col = scan.nextInt() - 1;

        chairs[box_row][box_col] = 1;

            if (box_row == 0 && box_col == 0) {
                topLeftCheck(chairs, box_row, box_col, a_row, a_col);
            }
            else if(box_row + 1 == row && box_col + 1 == col){
                bottomRightCheck(chairs, box_row, box_col, a_row, a_col);
            }
            else if(box_row + 1 == 1 && box_col + 1 == col){
                topRightCheck(chairs, box_row, box_col, a_row, a_col);
            }
            else if(box_row + 1 == row && box_col + 1 == 1){
                bottomLeftCheck(chairs, box_row, box_col, a_row, a_col);
            }
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(chairs[i][j] + " ");
                }
                System.out.println(" ");
            }




    }

    public static int[][] topLeftCheck(int[][] chair, int box_r, int box_c,int a_r , int a_c) {
        int turn = 0;
        while (true) {
            try {
                if (chair[box_r][box_c + 1] != 1) {
                    if(chair[box_r][box_c] == 0){
                        System.out.println("Ali says move the box to the right");
                    }
                    box_c = box_c + 1;
                    chair[box_r][box_c] = 1;

                    continue;

                }


            } catch (ArrayIndexOutOfBoundsException e) {

            }

            try {
                if (turn == 0) {
                    box_r++;
                    turn++;
                }
                if (chair[box_r][box_c] != 1) {
                    if(chair[box_r][box_c] == 0 && chair[box_r+1][box_c+1] < 3){
                        System.out.println("Ali says move the box to the left");
                    }
                    else if (chair[box_r][box_c] == 0 && chair[box_r+1][box_c+1] > 3)
                        System.out.println("Ali says move the box to the back");


                    chair[box_r][box_c] = 1;
                    box_c = box_c - 1;


                    continue;
                }


            } catch (ArrayIndexOutOfBoundsException e) {

            }


            try {
                if (turn == 1) {
                    box_r++;
                    System.out.println(box_r+" "+ box_c);

                }
                if (chair[box_r][box_c+1] != 1) {

                    

                    box_c = box_c + 1;
                    chair[box_r][box_c] = 1;


                    continue;


                }

            } catch (ArrayIndexOutOfBoundsException e) {

            }
            return chair;

        }
    }

        public static int[][] bottomRightCheck(int[][] chair, int box_r, int box_c, int a_r , int a_c) {
            int turn = 0;

            while(true){
                try {

                    if (chair[box_r][box_c - 1] != 1) {
                        if(chair[box_r][box_c] == 0){
                            System.out.println("Ali says move the box to the left");
                        }
                        box_c = box_c - 1;
                        chair[box_r][box_c] = 1;
                        continue;

                    }


                } catch (ArrayIndexOutOfBoundsException e) {

                }

                try {
                    if(turn == 0){
                        box_r--;
                        turn++;
                    }
                    if (chair[box_r][box_c] != 1) {
                        if(chair[box_r][box_c] == 0){
                            System.out.println("Ali says move the box to the right");
                        }


                        chair[box_r][box_c] = 1;
                        box_c = box_c + 1;


                        continue;
                    }


                } catch (ArrayIndexOutOfBoundsException e) {

                }


                try {
                    if(turn == 1){
                        box_r--;
                    }
                    if(chair[box_r][box_c] == 0){
                        System.out.println("Ali says move the box to the left");
                    }
                    if (chair[box_r][box_c - 1] != 1) {
                        box_c = box_c - 1;
                        chair[box_r][box_c] = 1;

                        continue;


                    }

                } catch (ArrayIndexOutOfBoundsException e) {

                }
                return chair;


            }







    }
    public static int[][] topRightCheck(int[][] chair, int box_r, int box_c, int a_r , int a_c) {
        int turn = 0;
        while (true) {
            try {
                if (chair[box_r][box_c - 1] != 1) {
                    if(chair[box_r][box_c] == 0){
                        System.out.println("Ali says move the box to the left");
                    }
                    box_c = box_c - 1;
                    chair[box_r][box_c] = 1;
                    continue;

                }


            } catch (ArrayIndexOutOfBoundsException e) {

            }

            try {
                if (turn == 0) {
                    box_r++;
                    turn++;
                }
                if (chair[box_r][box_c] != 1) {
                    if(chair[box_r][box_c] == 0){
                        System.out.println("Ali says move the box to the right");
                    }


                    chair[box_r][box_c] = 1;
                    box_c = box_c + 1;


                    continue;
                }


            } catch (ArrayIndexOutOfBoundsException e) {

            }


            try {
                if (turn == 1) {
                    box_r++;
                }
                if (chair[box_r][box_c - 1] != 1) {
                    if(chair[box_r][box_c] == 0){
                        System.out.println("Ali says move the box to the left");
                    }
                    box_c = box_c - 1;
                    chair[box_r][box_c] = 1;

                    continue;


                }

            } catch (ArrayIndexOutOfBoundsException e) {

            }
            return chair;

        }
    }
    public static int[][] bottomLeftCheck(int[][] chair, int box_r, int box_c, int a_r , int a_c) {
        int turn = 0;
        while (true) {
            try {
                if (chair[box_r][box_c + 1] != 1) {
                    if(chair[box_r][box_c] == 0){
                        System.out.println("Ali says move the box to the right");
                    }
                    box_c = box_c + 1;
                    chair[box_r][box_c] = 1;
                    continue;

                }


            } catch (ArrayIndexOutOfBoundsException e) {

            }

            try {
                if (turn == 0) {
                    box_r--;
                    turn++;

                }
                if (chair[box_r][box_c ] != 1) {
                    if(chair[box_r][box_c] == 0){
                        System.out.println("Ali says move the box to the left");
                    }


                    chair[box_r][box_c] = 1;
                    box_c = box_c - 1;



                    continue;
                }


            } catch (ArrayIndexOutOfBoundsException e) {

            }


            try {
                if (turn == 1) {
                    box_r--;
                }
                if (chair[box_r][box_c + 1] != 1) {
                    if(chair[box_r][box_c] == 0){
                        System.out.println("Ali says move the box to the right");
                    }
                    box_c = box_c + 1;
                    chair[box_r][box_c] = 1;

                    continue;


                }

            } catch (ArrayIndexOutOfBoundsException e) {

            }
            return chair;

        }
    }

    public static void aliCheck(int a_r,int a_c, int c_r, int c_c) {


    }
}
