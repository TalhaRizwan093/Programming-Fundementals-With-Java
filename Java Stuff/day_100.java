package com.company;

import java.time.DayOfWeek;
import java.util.Scanner;

public class day_100 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter Current day: 1Mon 2Tue 3wed 4thurs 5fri 6sat 7sun");
        int day = scan.nextInt();
        DayOfWeek weekday = DayOfWeek.of(day);


        if (day == 7) {
            day = 2;
            DayOfWeek day_100 = DayOfWeek.of(day);
            System.out.println("Day after 100th day of " + weekday + " is "+ day_100);

        }
        else if (day == 6){
            day = 1;
            DayOfWeek day_100 = DayOfWeek.of(day);
            System.out.println("Day after 100th day of " + weekday + " is "+ day_100);
        }
        else if (day >=1 && day<=5) {
            day = day;
            DayOfWeek day_100 = DayOfWeek.of(day + 2);
            System.out.println("Day after 100th day of " + weekday + " is "+ day_100);
        }
        else
            System.out.println("Invalid day input");





    }






}
