
package com.company;

public class stringTask2 {


    public static void main(String[] args) {
        String obj_str = "I love Pakistan.Pakistan is my homeland";
        String[] token = obj_str.split("[.]");
        System.out.println("Tokenize of str_obj delimited by the full stop into token1 " + token[0]);
        System.out.println("Tokenize of str_obj delimited by the full stop into token2 " + token[1]);
        String token1 = token[0];
        String token2 = token[1];
        String[] token_space = token1.split("[ ]");
        System.out.println("Tokenize token1 delimited by space. " + token_space[0]);
        System.out.println("Tokenize token1 delimited by space. " + token_space[1]);
        System.out.println("Tokenize token1 delimited by space. " + token_space[2]);
        String[] token2_space = token2.split("[ ]");
        System.out.println("Tokenize token2 delimited by space. " +token2_space[0]);
        System.out.println("Tokenize token2 delimited by space. " +token2_space[1]);
        System.out.println("Tokenize token2 delimited by space. " +token2_space[2]);
        System.out.println("Tokenize token2 delimited by space. " +token2_space[3]);




    }

}
