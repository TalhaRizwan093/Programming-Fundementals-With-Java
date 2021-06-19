package com.company;

public class stringTask {


    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        System.out.println(s1.equals(s2));
        int a = s1.compareTo(s2);
        if (a > 0)
            System.out.println(s2 + " Is smaller");
        else if (a< 0)
            System.out.println(s1 + " Is smaller");
        else
            System.out.println("Both are equal");

        System.out.println("If both are equal or not: " + s1.equalsIgnoreCase(s2));

        System.out.println("Length of string 1 " + s1.length());
        System.out.println("Length of string 1 " + s2.length());
        System.out.println("Combined length of both Strings "+ s1.length()+s2.length());
        String s3 = s1 + s2;
        System.out.println("Substring of concatenated string 1 and 2 from index 0 to 2" + s3.substring(2));
        System.out.println("Substring of concatenated string 1 and 2 from index 1 to 4" + s3.substring(1,4));
        s1 = s1.toLowerCase();
        System.out.println("Lowercase String 1 " + s1);
        s1 = s1.toUpperCase();
        System.out.println("Uppercase String 1 " + s1);
        s3 = (s3.replace('a', 'z'));
        s3 = (s3.replace('e', 'z'));
        s3 = (s3.replace('i', 'z'));
        s3 = (s3.replace('o', 'z'));
        s3 = (s3.replace('u', 'z'));
        System.out.println("Replacing of vovels with Z in string 3 " + s3);


    }

}
