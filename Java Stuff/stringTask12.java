package com.company;

import java.util.Scanner;

public class stringTask12 {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        String pass,temp_pass;
        while(true){
            int digit_count = 0 , letter_count = 0;
            System.out.println("Enter the password you should follow the criteria:" +
                    "\n a.A password must have at least eight characters." +
                    "\n b.A password consists of only letters and digits." +
                    "\n c.A password must contain at least two digits.");
            pass = scan.next();
            temp_pass = pass.toLowerCase();

            int length = pass.length();
            if (length < 8 ){
                System.out.println("Please enter 8 characheter pass;");
                continue;
            }
            for (int i = 0 ; i< length ; i++){
                if (temp_pass.charAt(i) >= 'a' && temp_pass.charAt(i) <= 'z'){
                    letter_count = letter_count + 1;
                }
                else if (temp_pass.charAt(i) >= '0' && temp_pass.charAt(i) <= '9'){
                    digit_count = digit_count + 1;
                }
                else{
                    System.out.println("You entered wrong pass");
                    System.out.println(temp_pass.charAt(i));

                }


            }
            if (digit_count < 2){
                System.out.println("You should enter atleast two digits");
            }
            else{
                System.out.println("You entered correct password");
                break;


            }

        }


    }
}
