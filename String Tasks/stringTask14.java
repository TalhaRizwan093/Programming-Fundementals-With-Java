package com.company;

import java.util.Scanner;

public class stringTask14 {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        String s;
        System.out.println("Enter String:");
        s = scan.nextLine();
        int len = s.length();
        int numUpper = 0,numSpace = 0;
        for (int i = 0; i<=len-1 ; i++){
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                numUpper += 1;
            }
             else if (s.charAt(i) == ' '){
                 numSpace += 1;
            }
             else
                 continue;

        }
        System.out.println("Number of Upper case letters are: " + numUpper);
        System.out.println("Number of Spaces: "+ numSpace);
    }
}
