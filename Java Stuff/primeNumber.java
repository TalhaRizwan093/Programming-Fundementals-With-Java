package com.company;

public class primeNumber {
    public static void main (String args[]){
        int count = 0;
        int j = 0;
        for (int i=1 ; i<=100; i++){
            count = 0;
            for (j = i; j>=1;j--){
                if (i%j == 0)
                    count = count + 1;



        }if (count == 2)
                System.out.println(i);

    }

}
}


