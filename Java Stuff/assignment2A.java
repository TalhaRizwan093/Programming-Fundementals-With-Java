package com.company;

import java.util.Scanner;

public class assignment2A {
    public static int seaLevel(int currentLevel, int halfWay){
        int sealevel = 400;

        if(currentLevel == halfWay + sealevel){
            System.out.println("You are at half way there " +currentLevel + "," + halfWay + " meters left");
        }
        else if(currentLevel == sealevel){
            return currentLevel;
        }
            currentLevel -= 1;
            currentLevel = seaLevel(currentLevel,halfWay);
            return currentLevel;



    }
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        int yourLevel;

        System.out.println("Enter your level where you currently at in meters: ");
        yourLevel = scan.nextInt();
        int halfLevel = (yourLevel - 400)/2;
        yourLevel = seaLevel(yourLevel,halfLevel);
        System.out.println("You are at ground level " + yourLevel + " meters");
    }
}
