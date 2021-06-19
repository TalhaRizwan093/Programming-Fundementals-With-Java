package com.company;

import java.util.Random;

class randomNumber {

    public static void main(String args[]) {

        Random randNumber = new Random();
        int randomNumber = randNumber.nextInt(1001);
        System.out.print(randomNumber);

    }
}