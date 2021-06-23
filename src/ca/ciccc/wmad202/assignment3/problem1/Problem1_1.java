package ca.ciccc.wmad202.assignment3.problem1;

import java.util.Scanner;

public class Problem1_1 {
    public static void run() {
        Scanner in = new Scanner(System.in);

        // Problem1.1
        System.out.println("-------Problem1.1-----\n");

        System.out.print("Please enter a number: ");
        int userNum = in.nextInt();

        if (userNum % 10 == 0) {
            while (userNum % 10 == 0) {
                System.out.print("Please enter a number: ");
                userNum = in.nextInt();
            }
        }

        int reverse = 0;

        while (userNum > 0) {
            reverse = reverse * 10 + userNum % 10;
            userNum = userNum / 10;
        }

        System.out.printf("The reverse number is: %d", reverse);
    }
}
