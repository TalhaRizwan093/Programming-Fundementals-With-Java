package com.company;

import java.util.Scanner;

public class predefined {
    public static void main (String args[]){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter some text (less than 20 characters): ");
        String text = userInput.next();
        int textLength = text.length();
        System.out.println(textLength);
        if (textLength <= 20){
            String textReplaced = text.replaceAll("[^a-zA-Z]","");
            System.out.println(textReplaced);

    }

    }
}
