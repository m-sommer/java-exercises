package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        double length;
        double width;
        double area;
        Scanner in;
        Scanner in2;

        in = new Scanner(System.in);
        in2 = new Scanner(System.in);
        System.out.println("Please enter the length:");
        length = in.nextDouble();
        System.out.println("Please enter the height:");
        width = in2.nextDouble();

        area = (length * width);
        System.out.println(area);
    }
}
