package com.company;

public class currentTimeMili {
    public static void main (String args[]){
        long miliSec = System.currentTimeMillis();
        System.out.println("Time in milisecond is: " + miliSec);
        long second = miliSec / 1000;
        long curtSecond = second % 60;
        long minute = second / 60 ;
        int curtMinute = (int) minute % 60;
        long hours = minute / 60;
        int curtHours = (int) hours % 24;
        System.out.println("Current time from " + miliSec + " MilliSeconds to Hour:Minute:Second is " + curtHours + ":" + curtMinute + ":" + curtSecond);

    }
}
