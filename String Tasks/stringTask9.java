package com.company;

public class stringTask9 {
    public static void main (String args[]){
                String s = "hello$world! This is <Pak123istan>.";
                String s2 = "";
                int length = s.length();
                for (int i = 0; i <=length-1; i++){
                    if((int)s.charAt(i) >=32 && (int)s.charAt(i) <=47 || (int)s.charAt(i) >= 58 && (int)s.charAt(i) <= 64 || (int)s.charAt(i) >= 91 && (int)s.charAt(i) <= 96 || (int)s.charAt(i) >= 123 && (int)s.charAt(i) <= 127 ){
                    continue;
                }
                else
                    s2 = s2 + s.charAt(i);



        }
        System.out.println(s2);
    }
}
