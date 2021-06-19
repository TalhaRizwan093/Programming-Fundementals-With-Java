package com.company;

import java.util.Scanner;

public class Quiz1 {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        String s;
        String s2 = "";
        int count = 1;
        int length=0;
        System.out.println("Please enter a text:");
        s = scan.nextLine();

        // loop for counting the number of inputs
        while (count <3){

            length = s.length();
            if (length > 20){
                count++;
            }
            else{
                break;
            }

            System.out.println("Sorry, the length of this text exceeds 20 characters. ");
            System.out.println("Please enter a text:");
            s = scan.nextLine();

        }
        if (count  == 3 ) {
            System.out.println("You exceeded minimum retry (you had 3 trys only): ");
            System.exit(0);
        }

        //Using simple replace function
        String filterText = s.replaceAll("[^a-zA-Z]","");
        System.out.println("Filtered text (with predefined methods):"+filterText);


        // Using ASCII code filttering the string
        for (int i = 0; i <=length-1; i++){
            if((int)s.charAt(i) >=32 && (int)s.charAt(i) <=64 || (int)s.charAt(i) >= 91 && (int)s.charAt(i) <= 96 || (int)s.charAt(i) >= 123 && (int)s.charAt(i) <= 127 ){
                continue;
            }
            else
                s2 = s2 + s.charAt(i);
        }
        System.out.println("Filtered text (without predefined methods):"+ s2);

    }
}
