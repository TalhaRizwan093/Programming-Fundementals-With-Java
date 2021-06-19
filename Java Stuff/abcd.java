package com.company;

import java.util.Scanner;

public class abcd {

        public static String RightSide(int n , int e){
            if(n==e){
                return n  +"";
            }

            return n + "    " + RightSide(n+5 ,e);
        }
        public static String LeftSide(int n,int e){

            if (n<=0){
                return  "" + RightSide(n,e);
            }
            return n+ "    " + LeftSide(n-5,e) ;
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("enter N: ");
            int N =  sc.nextInt();
            System.out.println(" Pattern is: \n" + LeftSide(N,N));
        }
    }

