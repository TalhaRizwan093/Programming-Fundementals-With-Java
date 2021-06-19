package com.company;

import java.util.Scanner;

public class hangMan {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        String word;
        char guess;
        System.out.println("Enter the desired word: ");
        word = scan.next();
        word = word.toLowerCase();
        int chances = 0, win = 0;
        int len = word.length();
        boolean guesscheck = false,wordcheck = false;
        String guessWord = "";
        for (int i = 0; i <= len - 1; i++) {
            guessWord = guessWord + "*";
        }
        do {
            guesscheck = false;
            System.out.println("Enter guess character");
            guess = scan.next().charAt(0);
            guess = Character.toLowerCase(guess);

            for (int l = 0 ; l <= len-1 ; l++){
                if (guessWord.charAt(l) == guess){
                    System.out.println("You cannot enter same word again and again");
                    wordcheck = true;
                    break;
                }
            }
            for (int j = 0; j <= len - 1; j++) {
                if (word.charAt(j) == guess) {

                    guessWord = guessWord.substring(0, j) + word.charAt(j) + guessWord.substring(j + 1);
                    guesscheck = true;
                }
            }

            if (wordcheck == true){
                wordcheck = false;
                guesscheck = false;
                continue;

            }

            if (guesscheck == false) {
                chances += 1;
            }
            else {
                System.out.println(guessWord);
                System.out.println("Yes " + guess + " is in the secret word");

            }


            if (guesscheck == false){
                if (chances == 1) {
                    System.out.println("Wrong guess, try again");
                    System.out.println("   ____________");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   | ");
                    System.out.println("___|___");

                }

                if (chances == 2) {
                    System.out.println("Wrong guess, try again");
                    System.out.println("   ____________");
                    System.out.println("   |          _|_");
                    System.out.println("   |         /   \\");
                    System.out.println("   |        |     |");
                    System.out.println("   |         \\_ _/");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("___|___");
                }

                if (chances == 3) {
                    System.out.println("Wrong guess, try again");
                    System.out.println("   ____________");
                    System.out.println("   |          _|_");
                    System.out.println("   |         /   \\");
                    System.out.println("   |        |     |");
                    System.out.println("   |         \\_ _/");
                    System.out.println("   |           |");
                    System.out.println("   |           |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("___|___");
                }

                if (chances == 4) {
                    System.out.println("Wrong guess, try again");
                    System.out.println("   ____________");
                    System.out.println("   |          _|_");
                    System.out.println("   |         /   \\");
                    System.out.println("   |        |     |");
                    System.out.println("   |         \\_ _/");
                    System.out.println("   |          _|");
                    System.out.println("   |      ___/ |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("___|___");
                }

                if (chances == 5) {
                    System.out.println("Wrong guess, try again");
                    System.out.println("   ____________");
                    System.out.println("   |          _|_");
                    System.out.println("   |         /   \\");
                    System.out.println("   |        |     |");
                    System.out.println("   |         \\_ _/");
                    System.out.println("   |          _|_");
                    System.out.println("   |      ___/ | \\___");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("   |");
                    System.out.println("___|___");

                }

                if (chances == 6) {
                    System.out.println("Wrong guess, try again");
                    System.out.println("   ____________");
                    System.out.println("   |          _|_");
                    System.out.println("   |         /   \\");
                    System.out.println("   |        |     |");
                    System.out.println("   |         \\_ _/");
                    System.out.println("   |          _|_");
                    System.out.println("   |      ___/ | \\___");
                    System.out.println("   |           |");
                    System.out.println("   |          /");
                    System.out.println("   |         /");
                    System.out.println("___|___");

                }

                if (chances == 7) {
                    System.out.println("Game Over, You lose");
                    System.out.println("   ____________");
                    System.out.println("   |          _|_");
                    System.out.println("   |         /   \\");
                    System.out.println("   |        |     |");
                    System.out.println("   |         \\_ _/");
                    System.out.println("   |          _|_");
                    System.out.println("   |      ___/ | \\___");
                    System.out.println("   |           |");
                    System.out.println("   |          / \\");
                    System.out.println("   |         /   \\");
                    System.out.println("___|___");
                    break;
                }

            }


            if (guessWord.contains("*")){
                continue;

            }
            else if(!guessWord.contains("*")){
                System.out.println("Yoo hooo, You won the game");
                break;
            }

            guesscheck = false;


        } while (chances <= 7);


    }
}
