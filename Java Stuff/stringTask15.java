package com.company;

import java.util.Scanner;

public class stringTask15 {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        String s;
        System.out.println("Enter String:");
        s = scan.nextLine();
        int len = s.length();
        int numWords = 0,numLines = 0, charCounts = 0;
        for (int i = 0; i<=len-1 ; i++){
            if ((int)s.charAt(i) == '.'){
                numLines += 1;
            }
            else if (s.charAt(i) == ' '){
                numWords += 1;
            }
            else if (s.charAt(i) != ' '){
                charCounts += 1;
            }
            else
                continue;

        }
        numWords += 1;
        System.out.println("Number of Words are: " + numWords);
        System.out.println("Number of Lines: "+ numLines);
        System.out.println("Number of characters in a paragraph: " + charCounts );

    }
}