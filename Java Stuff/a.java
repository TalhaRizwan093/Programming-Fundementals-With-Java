package com.company;

import java.util.Scanner;

public class a {
    public static void main(String[] args)
    {

        int a=5 , i;
        i = ++a + ++a + a++;
        i = a++ + ++a + ++a;
        a = ++a + ++a + a++;
        System.out.println(a);
        System.out.println(i);

    }
}
