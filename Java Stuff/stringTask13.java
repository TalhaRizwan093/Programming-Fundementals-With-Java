package com.company;

import java.util.Scanner;

public class stringTask13 {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        String s ;
        System.out.println("Enter the string you want to sort");
        s = scan.next();
        int len = s.length();
        String s1 = "";
        char temp1 = ' ';
        char temp2 = ' ';



        for (int i = 0; i<=len-1;i++){


            for (int j= i; j<=len-1;j++){

                if (s.charAt(i) > s.charAt(j)){
                    temp1 = s.charAt(i);
                    temp2 = s.charAt(j);

                    s = s.substring(0,i) + temp2 + s.substring(i + 1);
                    s = s.substring(0,j) + temp1 + s.substring(j + 1);

            }

            }

        }

        System.out.println("Sorted string is: " + s);
    }
}
