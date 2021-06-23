package ca.ciccc.wmad202.assignment3.problem5;

import java.util.Scanner;

public class Problem5_5 {
    public static void run() {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a number which is the length of the side of a square: ");
        int userLength = in.nextInt();

        double area = calculateArea(userLength);

        System.out.printf("The area of a circle which is crossing from all corners of the square is: %.5f", area);

    }

    public static double calculateArea(int userLength){
        double radius = (Math.sqrt(2) * userLength) / 2;
        double areaOfCircle = radius * radius * Math.PI;

        return areaOfCircle;
    }
}
