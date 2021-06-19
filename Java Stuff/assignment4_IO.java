package com.company;

import java.util.Scanner;
import java.io.*;

public class assignment4_IO {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        //Some Variables
        int row=0, col=0, num = 2, turn = 0,temp,temp1;
        int box_row=0, box_col=0;
        int a_row=0, a_col=0;
        String[] sep;
        String row_col;

        //Reading from File
        try{
            File recordFile = new File("recordFile.txt");
                Scanner readData = new Scanner(recordFile);
                for(int i = 0; i<3 ; i++){
                    if(i == 0){
                        row_col = readData.nextLine();
                        sep = row_col.split(",");
                        row = Integer.parseInt(sep[0]);
                        col = Integer.parseInt(sep[1]);
                    }
                    else if(i==1){
                        row_col = readData.nextLine();
                        sep = row_col.split(",");
                        box_row = Integer.parseInt(sep[0])-1;
                        box_col = Integer.parseInt(sep[1])-1;

                    }
                    else if(i == 2){
                        row_col = readData.nextLine();
                        sep = row_col.split(",");
                        a_row = Integer.parseInt(sep[0]);
                        a_col = Integer.parseInt(sep[1]);

                    }
                    else
                        break;

                }

        }
        catch(IOException e){
            System.out.println("Some error occured delete older file maybe to fix:");
            System.exit(1);

        }


        //Chairs with rows and columns
        int[][] chairs = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                chairs[i][j] = num;
                num++;
            }
        }
        //Condition to check if user gives only corner values else program will exit.
        if(box_row == 0 && box_col == 0){

        }
        else if(box_row == 0 && box_col == col-1){
        }
        else if(box_row == row-1 && box_col == 0){
        }
        else if(box_row == row-1 && box_col == col-1){

        }
        else{
            System.out.println("Please enter cornor values only and try again");
            System.exit(1);
        }
        //Exception if User inputs out of bound location of Ali

        chairs[a_row - 1][a_col - 1] = 0;

        //Check if cornor position and ali position is same
        if(aliCheck(chairs,box_row,box_col)){ // Method for telling where to pass the chocalate box
            System.exit(1);
        }

        //Giving location 1 to location those who get Chocolate
        chairs[box_row][box_col] = 1;

        //Infinite loop to itrate over the array with mentioned rules
        while(true){
            temp = box_col;

            //Method which will check whether the box moves right or not using exception handling
            box_col = goingRight(chairs,box_row,box_col);
            if (box_col == -1){
                break;
            }
            //If the value change the loop continue. So that it will not run other check to go left,up or down
            if(box_col != temp){
                chairs[box_row][box_col] = 1;
                continue;
            }

            temp = box_col;
            //Method which will check whether the box moves left or not using exception handling
            box_col=goingLeft(chairs,box_row,box_col);
            if (box_col == -1){
                break;
            }
            //If the value change the loop continues. So that it will not run other check to go left,up or down
            if(box_col != temp){
                chairs[box_row][box_col] = 1;
                continue;
            }

            temp1 = box_row;
            //Method which will check whether the box moves forward or not using exception handling
            box_row=goingForward(chairs,box_row,box_col);
            if (box_row == -1){
                break;
            }
            //If the value change the loop continues. So that it will not run other check to go left,up or down
            if(box_row != temp1){

                chairs[box_row][box_col] = 1;
                continue;
            }
            //If the value change the loop continues. So that it will not run other check to go left,up or down
            temp1 = box_row;
            box_row=goingBack(chairs,box_row,box_col);
            if (box_row == -1){
                break;
            }
            //If the value change the loop continues. So that it will not run other check to go left,up or down
            if(box_row != temp1){
                chairs[box_row][box_col] = 1;


            }

        }
    }

    public static int goingRight(int[][] chairs, int b_row, int b_col) {
        boolean aliCheck = false; //Ali status
        //Method For itrating to right with Excaption Handling
        try{
            if(chairs[b_row][b_col+1] != 1){ //Ali position check
                aliCheck = aliCheck(chairs,b_row,b_col+1);
                //If alicheck is true then it gives -1 status which will break the program
                if (aliCheck){
                    return b_col = -1;
                }
                //Otherwise it goes right
                return b_col += 1;

            }

        }
        catch (ArrayIndexOutOfBoundsException e){
            return b_col;

        }
        return b_col;

    }
    //Method For itrating to Left with Excaption Handling (CHeck previous comments to understand this method also)
    public static int goingLeft(int[][] chairs, int b_row, int b_col) {
        boolean aliCheck = false;
        try{
            if(chairs[b_row][b_col-1] != 1){
                aliCheck = aliCheck(chairs,b_row,b_col-1);
                if (aliCheck){
                    return b_col = -1;
                }
                return b_col -= 1;

            }

        }
        catch (ArrayIndexOutOfBoundsException e){
            return b_col;
        }
        return b_col;

    }
    //Method For itrating to up with Excaption Handling (CHeck previous comments to understand this method also)
    public static int goingForward(int[][] chairs, int b_row, int b_col) {
        boolean aliCheck = false;
        try{
            if(chairs[b_row+1][b_col] != 1){

                aliCheck = aliCheck(chairs,b_row+1,b_col);
                if (aliCheck){
                    return b_row = -1;
                }
                return b_row += 1;

            }

        }
        catch (ArrayIndexOutOfBoundsException e){
            return b_row;
        }
        return b_row;

    }
    //Method For itrating to back with Excaption Handling (CHeck previous comments to understand this method also)
    public static int goingBack(int[][] chairs, int b_row, int b_col) {
        boolean aliCheck = false;
        try{
            if(chairs[b_row-1][b_col] != 1){
                aliCheck = aliCheck(chairs,b_row-1,b_col);
                if (aliCheck){
                    return b_row = -1;
                }
                return b_row -= 1;

            }

        }
        catch (ArrayIndexOutOfBoundsException e){
            return b_row;
        }
        return b_row;

    }
    //Method for checking If Ali pass the box to right or left or forward or back or says up. And return -1
    public static boolean aliCheck(int[][]chairs,int b_row, int b_col) {
        File recordFile = new File("recordFile.txt");
        String str;
        byte[] Content;
        if(chairs[b_row][b_col]==0){ //check if the current location is ali's location
            try{ //Exception if index get out of bound
                if(chairs[b_row][b_col+1] != 1){
                    try {      //Excetion for Writing output
                        OutputStream os = new FileOutputStream(recordFile,true);  //Output Stream Class
                        str = "Ali will move the box to the RIGHT!";   //Value of Output
                        byte[] strContent = str.getBytes();  //Converted to bytes because Output Stream only take bytes
                        os.write(strContent); //Writing the bytes in the txt file
                        return true;
                    }
                    catch (IOException e){

                    }


                }

            }catch (ArrayIndexOutOfBoundsException e){

            }
            try{
                if(chairs[b_row][b_col-1] != 1){
                    try {
                        OutputStream os = new FileOutputStream(recordFile,true);
                        str = "Ali will move the box to the LEFT!";
                        byte[] strContent = str.getBytes();
                        os.write(strContent);
                        return true;
                    }
                    catch (IOException e){

                    }

                }

            }catch (ArrayIndexOutOfBoundsException e){

            }
            try{
                if(chairs[b_row+1][b_col] != 1){
                    try {
                        OutputStream os = new FileOutputStream(recordFile,true);
                        str = "Ali will move the box to the FORWARD!";
                        byte[] strContent = str.getBytes();
                        os.write(strContent);
                        return true;
                    }
                    catch (IOException e){

                    }
                }

            }catch (ArrayIndexOutOfBoundsException e){

            }
            try{
                if(chairs[b_row-1][b_col] != 1){
                    try {
                        OutputStream os = new FileOutputStream(recordFile,true);
                        str = "Ali will move the box to the BACK!";
                        byte[] strContent = str.getBytes();
                        os.write(strContent);
                        return true;
                    }
                    catch (IOException e){

                    }
                }

            }catch (ArrayIndexOutOfBoundsException e){

            }
            //Conditions if Ali at cornor and is the last person
            if(chairs[0][0] == chairs[b_row][b_col]){

            }
            else if(chairs[b_row][0] == chairs[b_row][b_col]){
                try {
                    OutputStream os = new FileOutputStream(recordFile,true);
                    str = "Ali will say “UP”!!";
                    byte[] strContent = str.getBytes();
                    os.write(strContent);
                    return true;
                }
                catch (IOException e){

                }
            }
            else if(chairs[0][b_col] == chairs[b_row][b_col]){
                try {
                    OutputStream os = new FileOutputStream(recordFile,true);
                    str = "Ali will say “UP”!!";
                    byte[] strContent = str.getBytes();
                    os.write(strContent);
                    return true;
                }
                catch (IOException e){

                }
            }
            else if(chairs[b_row][b_col] == chairs[b_row][b_col]){
                try {
                    OutputStream os = new FileOutputStream(recordFile,true);
                    str = "Ali will say “UP”!!";
                    byte[] strContent = str.getBytes();
                    os.write(strContent);
                    return true;
                }
                catch (IOException e){

                }
            }


        }
        return false;
    }
}

