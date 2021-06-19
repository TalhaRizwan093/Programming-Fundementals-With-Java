package com.company;

import javax.swing.*;

public class dailogBoxCircleArea {
    public static void main (String args[]){
        final float pi = 3.14f;
        int radius = Integer.parseInt(JOptionPane.showInputDialog("Enter Radius of circle"));
        JOptionPane.showMessageDialog(null , "Area of Circle is: "+ pi*radius*radius);

    }
}
