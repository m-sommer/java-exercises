package exercises;

import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        double miles;
        double gallons;
        double mpg;
        Scanner in;
        Scanner in2;

        in = new Scanner(System.in);
        in2 = new Scanner(System.in);
        System.out.println("How many miles did you drive?");
        miles = in.nextDouble();
        System.out.println("How many gallons of gas did you use?");
        gallons = in2.nextDouble();

        mpg = (miles / gallons);
        System.out.println(mpg + " MPG");
    }
}
