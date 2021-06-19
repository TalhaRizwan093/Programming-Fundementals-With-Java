package com.company;
import java.util.Scanner;
public class hangman2 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String unsortedWord = userInput.next();
        String sortedWord = "";
        int length = unsortedWord.length();
        char characterOne,characterTwo;
        for(int i = 0; i <= length-1 ; i++){
            for(int j = i; j <= length-1 ; j++){

                if(unsortedWord.charAt(i) > unsortedWord.charAt(j)){

                    characterOne = unsortedWord.charAt(i);

                    characterTwo = unsortedWord.charAt(j);

                    unsortedWord = unsortedWord.substring(0,i)+characterTwo+unsortedWord.substring(i+1);
                    unsortedWord= unsortedWord.substring(0,j)+characterOne+unsortedWord.substring(j+1);
                }
            }
        }
        System.out.println(unsortedWord);
    }
}
