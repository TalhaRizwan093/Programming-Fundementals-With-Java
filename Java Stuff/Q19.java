package com.company;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x1,x2,x3,y1,y2,y3;
        double area_1,area_2,area_3, a_sides, area;

        System.out.print("Enter three points for a triangle: ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        x3 = input.nextDouble();
        y3 = input.nextDouble();

        area_1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 1/2);
        area_2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 1/2);
        area_3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 1/2);
        a_sides= (area_1 + area_2 + area_3) / 2;
        area = Math.pow(a_sides * (a_sides - area_1) * (a_sides - area_2) * (a_sides - area_3), 1/2);

        System.out.println("Triangle area is: " + area);
    }
}



