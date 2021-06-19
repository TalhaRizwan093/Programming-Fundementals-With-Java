package com.company;

public class stringtask8 {
    public static void main(String args[]){
        // create a StringBuilder object
        // usind StringBuilder() constructor
        StringBuilder str = new StringBuilder();

        str.append("GFG");

        // print string
        System.out.println("String = " + str.toString());

        // create a StringBuilder object
        // usind StringBuilder(CharSequence) constructor
        StringBuilder str1 = new StringBuilder("JAVA");

        // print string
        System.out.println("String1 = " + str1.toString());

        // create a StringBuilder object
        // usind StringBuilder(capacity) constructor
        StringBuilder str2 = new StringBuilder(10);

        // print string
        System.out.println("String2 capacity = " + str2.capacity());

        // create a StringBuilder object
        // usind StringBuilder(String) constructor
        StringBuilder str3 = new StringBuilder(str1);

        // print string
        System.out.println("String3 = " + str3.toString());

        //STRING BUFFER
        StringBuffer sb=new StringBuffer("Hello ");
        System.out.println(sb);

        System.out.println("Inserts a char or any other type in specific location:" + sb.insert(1,'a'));

        System.out.printf("Deletes character: " + sb.deleteCharAt(0));





    }
}
