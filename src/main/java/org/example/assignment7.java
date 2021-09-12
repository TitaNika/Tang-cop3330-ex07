/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Tony Tang
 */

package org.example;
import java.util.Scanner;

public class assignment7 {

    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the length of the room in feet?");
        double length = scan.nextDouble();

        System.out.println("What is the width of the room in feet?");
        double width = scan.nextDouble();

        System.out.println("You entered dimension of "+length+" by "+width+" feet");


        double area = length*width;
        double conversionFormula = area * 0.09290304;


        System.out.println("The area is: ");
        System.out.println(area+" square feet");
        System.out.println(conversionFormula+" square meters");
    }
}