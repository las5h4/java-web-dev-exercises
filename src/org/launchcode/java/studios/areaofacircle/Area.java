package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius:");
        Double radius = input.nextDouble();
        while (radius <= 0) {
            System.out.println("Invalid. Enter radius:");
            radius = input.nextDouble();
        }
        if (radius > 0) {
            Double area = Circle.getArea(radius);
            System.out.println("The area of a circle with a radius of " + radius + " is " + area + ".");
        }

    }
}
