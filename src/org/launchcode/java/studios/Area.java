package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        double r;
        double pi;
        Scanner in;

        pi = 3.14;
        in = new Scanner(System.in);
        System.out.println("Enter a radius:");
        r = in.nextDouble();

        while (r < 0) {
            System.out.println("Please enter a positive number:");
            r = in.nextDouble();
        }
        System.out.print(pi * r * r);
    }
}
