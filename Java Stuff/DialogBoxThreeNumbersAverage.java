package com.company;

import javax.swing.*;

public class DialogBoxThreeNumbersAverage {
    public static void main (String args[]){
        String firstFraction = JOptionPane.showInputDialog("Enter First Fraction:");
        int numinator;
        int denominator;
        String[] fractionPart_1 = firstFraction.split("/");
        numinator = Integer.parseInt(fractionPart_1[0]);
        denominator = Integer.parseInt(fractionPart_1[1]);
        float firstNumberInFloat = numinator / denominator;
        String secondFraction = JOptionPane.showInputDialog("Enter Second Fraction:");
        String[] fractionPart_2 = secondFraction.split("/");
        numinator = Integer.parseInt(fractionPart_2[0]);
        denominator = Integer.parseInt(fractionPart_2[1]);
        float secondNumberInFloat = numinator / denominator;
        String thirdFraction = JOptionPane.showInputDialog("Enter Third Fraction:");
        String[] fractionPart_3 = thirdFraction.split("/");
        numinator = Integer.parseInt(fractionPart_3[0]);
        denominator = Integer.parseInt(fractionPart_3[1]);
        float thirdNumberInFloat = numinator / denominator;
        JOptionPane.showMessageDialog(null,"Average of three fractional numbers is " + (firstNumberInFloat + secondNumberInFloat + thirdNumberInFloat)/3);


    }
}
