package com.company;

import java.util.Scanner;

public class ticktack {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int player1, player2;
        char place_1 = '1', place_2 = '2'  , place_3 = '3', place_4 = '4', place_5 = '5', place_6 = '6', place_7 = '7', place_8 = '8', place_9 = '9';
        System.out.println("O for first player and X for Second player:" +
                "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                "\n--|---|--" +
                "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                "\n--|---|--" +
                "\n"+    place_7 + " | " + place_8 + " | " + place_9 );
        System.out.println("Player_1 please select place: ");
        player1 = scan.nextInt();
        if (player1 == 1) {
            place_1 = 'O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else if (player1 == 2) {
            place_2 = 'O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else if (player1 == 3) {
            place_3 = 'O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }

        else if (player1 == 4) {
            place_4 = 'O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }

        else if (player1 == 5) {
            place_5 ='O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }

        else if (player1 == 6) {
            place_6 = 'O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );


        }
        else if (player1 == 7) {
            place_7 = 'O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else if (player1 == 8) {
            place_8 = 'O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else if (player1 == 9) {
            place_9 ='O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else
            System.out.println("You picked wrong location");

        System.out.println("Player_2 please select place: ");
        player2 = scan.nextInt();
        if (player2 == 1) {
            place_1 = 'X';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else if (player2 == 2) {
            place_2 = 'X';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else if (player2 == 3) {
            place_3 = 'X';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }

        else if (player2 == 4) {
            place_4 = 'X';

            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }

        else if (player2 == 5) {
            place_5 = 'X';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }

        else if (player2 == 6) {
            place_6 = 'X';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else if (player2 == 7) {
            place_7 = 'X';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else if (player2 == 8) {
            place_8 = 'X';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else if (player2 == 9) {
            place_9 = 'X';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else
            System.out.println("You picked wrong location");

        System.out.println("Player_1 please select place: ");
        player1 = scan.nextInt();
        if (player1 == 1) {
            place_1 = 'O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else if (player1 == 2) {
            place_2 = 'O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else if (player1 == 3) {
            place_3 = 'O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }

        else if (player1 == 4) {
            place_4 = 'O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }

        else if (player1 == 5) {
            place_5 ='O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }

        else if (player1 == 6) {
            place_6 = 'O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );


        }
        else if (player1 == 7) {
            place_7 = 'O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else if (player1 == 8) {
            place_8 = 'O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else if (player1 == 9) {
            place_9 ='O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else
            System.out.println("You picked wrong location");
        if (place_1 == 'O' && place_2 == 'O' && place_3 == 'O' || place_1 == 'O' && place_4 == 'O' && place_7 == 'O' || place_1 == 'O' && place_5 == 'O' && place_9 == 'O' || place_4 == 'O' && place_5 == 'O' && place_6 == 'O' || place_7 == 'O' && place_8 == 'O' && place_9 == 'O' || place_3 == 'O' && place_6 == 'O' && place_9 == 'O' || place_2 == 'O' && place_5 == 'O' && place_8 == 'O') {
            System.out.print("Player 1 won the game");
            System.exit(0);
        }
        else if (place_1 == 'X' && place_2 == 'X' && place_3 == 'X' || place_1 == 'X' && place_4 == 'X' && place_7 == 'X' || place_1 == 'X' && place_5 == 'X' && place_9 == 'X' || place_4 == 'X' && place_5 == 'X' && place_6 == 'X' || place_7 == 'X' && place_8 == 'X' && place_9 == 'X' || place_3 == 'X' && place_6 == 'X' && place_9 == 'X' || place_2 == 'X' && place_5 == 'X' && place_8 == 'X'  ) {
            System.out.println("Player 2 won the game");
            System.exit(0);
        }
        else
            System.out.println("Game in Progress");

        System.out.println("Player_2 please select place: ");
        player2 = scan.nextInt();
        if (player2 == 1) {
            place_1 = 'X';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else if (player2 == 2) {
            place_2 = 'X';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else if (player2 == 3) {
            place_3 = 'X';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }

        else if (player2 == 4) {
            place_4 = 'X';

            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }

        else if (player2 == 5) {
            place_5 = 'X';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }

        else if (player2 == 6) {
            place_6 = 'X';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else if (player2 == 7) {
            place_7 = 'X';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else if (player2 == 8) {
            place_8 = 'X';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else if (player2 == 9) {
            place_9 = 'X';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else
            System.out.println("You picked wrong location");
        if (place_1 == 'O' && place_2 == 'O' && place_3 == 'O' || place_1 == 'O' && place_4 == 'O' && place_7 == 'O' || place_1 == 'O' && place_5 == 'O' && place_9 == 'O' || place_4 == 'O' && place_5 == 'O' && place_6 == 'O' || place_7 == 'O' && place_8 == 'O' && place_9 == 'O' || place_3 == 'O' && place_6 == 'O' && place_9 == 'O' || place_2 == 'O' && place_5 == 'O' && place_8 == 'O') {
            System.out.print("Player 1 won the game");
            System.exit(0);
        }
        else if (place_1 == 'X' && place_2 == 'X' && place_3 == 'X' || place_1 == 'X' && place_4 == 'X' && place_7 == 'X' || place_1 == 'X' && place_5 == 'X' && place_9 == 'X' || place_4 == 'X' && place_5 == 'X' && place_6 == 'X' || place_7 == 'X' && place_8 == 'X' && place_9 == 'X' || place_3 == 'X' && place_6 == 'X' && place_9 == 'X' || place_2 == 'X' && place_5 == 'X' && place_8 == 'X'  ) {
            System.out.println("Player 2 won the game");
            System.exit(0);
        }
        else
            System.out.println("Game in progress");


        System.out.println("Player_1 please select place: ");
        player1 = scan.nextInt();
        if (player1 == 1) {
            place_1 = 'O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else if (player1 == 2) {
            place_2 = 'O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );
        }
        else if (player1 == 3) {
            place_3 = 'O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }

        else if (player1 == 4) {
            place_4 = 'O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }

        else if (player1 == 5) {
            place_5 ='O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }

        else if (player1 == 6) {
            place_6 = 'O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );


        }
        else if (player1 == 7) {
            place_7 = 'O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else if (player1 == 8) {
            place_8 = 'O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else if (player1 == 9) {
            place_9 ='O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else
            System.out.println("You picked wrong location");
        if (place_1 == 'O' && place_2 == 'O' && place_3 == 'O' || place_1 == 'O' && place_4 == 'O' && place_7 == 'O' || place_1 == 'O' && place_5 == 'O' && place_9 == 'O' || place_4 == 'O' && place_5 == 'O' && place_6 == 'O' || place_7 == 'O' && place_8 == 'O' && place_9 == 'O' || place_3 == 'O' && place_6 == 'O' && place_9 == 'O' || place_2 == 'O' && place_5 == 'O' && place_8 == 'O') {
            System.out.print("Player 1 won the game");
            System.exit(0);
        }
        else if (place_1 == 'X' && place_2 == 'X' && place_3 == 'X' || place_1 == 'X' && place_4 == 'X' && place_7 == 'X' || place_1 == 'X' && place_5 == 'X' && place_9 == 'X' || place_4 == 'X' && place_5 == 'X' && place_6 == 'X' || place_7 == 'X' && place_8 == 'X' && place_9 == 'X' || place_3 == 'X' && place_6 == 'X' && place_9 == 'X' || place_2 == 'X' && place_5 == 'X' && place_8 == 'X'  ) {
            System.out.println("Player 2 won the game");
            System.exit(0);
        }
        else
            System.out.println("Game in Progress");

        System.out.println("Player_2 please select place: ");
        player2 = scan.nextInt();
        if (player2 == 1) {
            place_1 = 'X';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else if (player2 == 2) {
            place_2 = 'X';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else if (player2 == 3) {
            place_3 = 'X';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }

        else if (player2 == 4) {
            place_4 = 'X';

            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }

        else if (player2 == 5) {
            place_5 = 'X';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );
        }

        else if (player2 == 6) {
            place_6 = 'X';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else if (player2 == 7) {
            place_7 = 'X';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else if (player2 == 8) {
            place_8 = 'X';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else if (player2 == 9) {
            place_9 = 'X';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else
            System.out.println("You picked wrong location");
        if (place_1 == 'O' && place_2 == 'O' && place_3 == 'O' || place_1 == 'O' && place_4 == 'O' && place_7 == 'O' || place_1 == 'O' && place_5 == 'O' && place_9 == 'O' || place_4 == 'O' && place_5 == 'O' && place_6 == 'O' || place_7 == 'O' && place_8 == 'O' && place_9 == 'O' || place_3 == 'O' && place_6 == 'O' && place_9 == 'O' || place_2 == 'O' && place_5 == 'O' && place_8 == 'O') {
            System.out.print("Player 1 won the game");
            System.exit(0);
        }
        else if (place_1 == 'X' && place_2 == 'X' && place_3 == 'X' || place_1 == 'X' && place_4 == 'X' && place_7 == 'X' || place_1 == 'X' && place_5 == 'X' && place_9 == 'X' || place_4 == 'X' && place_5 == 'X' && place_6 == 'X' || place_7 == 'X' && place_8 == 'X' && place_9 == 'X' || place_3 == 'X' && place_6 == 'X' && place_9 == 'X' || place_2 == 'X' && place_5 == 'X' && place_8 == 'X') {
            System.out.println("Player 2 won the game");
            System.exit(0);
        }
        else
            System.out.println("Game In progress");



        System.out.println("Player_1 please select place: ");
        player1 = scan.nextInt();
        if (player1 == 1) {
            place_1 = 'O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else if (player1 == 2) {
            place_2 = 'O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else if (player1 == 3) {
            place_3 = 'O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }

        else if (player1 == 4) {
            place_4 = 'O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }

        else if (player1 == 5) {
            place_5 ='O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }

        else if (player1 == 6) {
            place_6 = 'O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );


        }
        else if (player1 == 7) {
            place_7 = 'O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );
        }
        else if (player1 == 8) {
            place_8 = 'O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else if (player1 == 9) {
            place_9 ='O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else
            System.out.println("You picked wrong location");
        if (place_1 == 'O' && place_2 == 'O' && place_3 == 'O' || place_1 == 'O' && place_4 == 'O' && place_7 == 'O' || place_1 == 'O' && place_5 == 'O' && place_9 == 'O' || place_4 == 'O' && place_5 == 'O' && place_6 == 'O' || place_7 == 'O' && place_8 == 'O' && place_9 == 'O' || place_3 == 'O' && place_6 == 'O' && place_9 == 'O' || place_2 == 'O' && place_5 == 'O' && place_8 == 'O') {
            System.out.print("Player 1 won the game");
            System.exit(0);
        }
        else if (place_1 == 'X' && place_2 == 'X' && place_3 == 'X' || place_1 == 'X' && place_4 == 'X' && place_7 == 'X' || place_1 == 'X' && place_5 == 'X' && place_9 == 'X' || place_4 == 'X' && place_5 == 'X' && place_6 == 'X' || place_7 == 'X' && place_8 == 'X' && place_9 == 'X' || place_3 == 'X' && place_6 == 'X' && place_9 == 'X' || place_2 == 'X' && place_5 == 'X' && place_8 == 'X') {
            System.out.println("Player 2 won the game");
            System.exit(0);
        }
        else
            System.out.println("Game In progress");

        System.out.println("Player_2 please select place: ");
        player2 = scan.nextInt();
        if (player2 == 1) {
            place_1 = 'X';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else if (player2 == 2) {
            place_2 = 'X';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else if (player2 == 3) {
            place_3 = 'X';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );
        }

        else if (player2 == 4) {
            place_4 = 'X';

            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }

        else if (player2 == 5) {
            place_5 = 'X';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );
        }

        else if (player2 == 6) {
            place_6 = 'X';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else if (player2 == 7) {
            place_7 = 'X';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else if (player2 == 8) {
            place_8 = 'X';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else if (player2 == 9) {
            place_9 = 'X';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else
            System.out.println("You picked wrong location");
        if (place_1 == 'O' && place_2 == 'O' && place_3 == 'O' || place_1 == 'O' && place_4 == 'O' && place_7 == 'O' || place_1 == 'O' && place_5 == 'O' && place_9 == 'O' || place_4 == 'O' && place_5 == 'O' && place_6 == 'O' || place_7 == 'O' && place_8 == 'O' && place_9 == 'O' || place_3 == 'O' && place_6 == 'O' && place_9 == 'O' || place_2 == 'O' && place_5 == 'O' && place_8 == 'O') {
            System.out.print("Player 1 won the game");
            System.exit(0);
        }
        else if (place_1 == 'X' && place_2 == 'X' && place_3 == 'X' || place_1 == 'X' && place_4 == 'X' && place_7 == 'X' || place_1 == 'X' && place_5 == 'X' && place_9 == 'X' || place_4 == 'X' && place_5 == 'X' && place_6 == 'X' || place_7 == 'X' && place_8 == 'X' && place_9 == 'X' || place_3 == 'X' && place_6 == 'X' && place_9 == 'X' || place_2 == 'X' && place_5 == 'X' && place_8 == 'X') {
            System.out.println("Player 2 won the game");
            System.exit(0);
        }
        else
            System.out.println("Game In progress");
        System.out.println("Player_1 please select place: ");


        player1 = scan.nextInt();
        if (player1 == 1) {
            place_1 = 'O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else if (player1 == 2) {
            place_2 = 'O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }
        else if (player1 == 3) {
            place_3 = 'O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }

        else if (player1 == 4) {
            place_4 = 'O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }

        else if (player1 == 5) {
            place_5 ='O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );

        }

        else if (player1 == 6) {
            place_6 = 'O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );


        }
        else if (player1 == 7) {
            place_7 = 'O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );
        }
        else if (player1 == 8) {
            place_8 = 'O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );
        }
        else if (player1 == 9) {
            place_9 ='O';
            System.out.println("O for first player and X for Second player:" +
                    "\n" +   place_1 + " | " + place_2 + " | " + place_3 +
                    "\n--|---|--" +
                    "\n"+    place_4 + " | " + place_5 + " | " + place_6 +
                    "\n--|---|--" +
                    "\n"+    place_7 + " | " + place_8 + " | " + place_9 );


        }
        else
            System.out.println("You picked wrong location");
        if (place_1 == 'O' && place_2 == 'O' && place_3 == 'O' || place_1 == 'O' && place_4 == 'O' && place_7 == 'O' || place_1 == 'O' && place_5 == 'O' && place_9 == 'O' || place_4 == 'O' && place_5 == 'O' && place_6 == 'O' || place_7 == 'O' && place_8 == 'O' && place_9 == 'O' || place_3 == 'O' && place_6 == 'O' && place_9 == 'O' || place_2 == 'O' && place_5 == 'O' && place_8 == 'O') {
            System.out.print("Player 1 won the game");
            System.exit(0);
        }
        else if (place_1 == 'X' && place_2 == 'X' && place_3 == 'X' || place_1 == 'X' && place_4 == 'X' && place_7 == 'X' || place_1 == 'X' && place_5 == 'X' && place_9 == 'X' || place_4 == 'X' && place_5 == 'X' && place_6 == 'X' || place_7 == 'X' && place_8 == 'X' && place_9 == 'X' || place_3 == 'X' && place_6 == 'X' && place_9 == 'X' || place_2 == 'X' && place_5 == 'X' && place_8 == 'X'  ) {
            System.out.println("Player 2 won the game");
            System.exit(0);
        }
        else
            System.out.println("Draw");



    }
}
