package ca.ciccc.wmad202.assignment3.problem1;

import java.util.Scanner;

public class Problem1_2 {
    public static void run(){
        Scanner in = new Scanner(System.in);

        // Problem1.2
        System.out.println("\n\n-------Problem1.2------\n");

        System.out.println("Please enter 2 numbers.");
        System.out.print("NumberA: ");
        int userNumA = in.nextInt();
        System.out.print("NumberB: ");
        int userNumB = in.nextInt();

        if (userNumA > userNumB) {
            int temp = userNumA;
            userNumA = userNumB;
            userNumB = temp;
        }

        System.out.println("The following numbers are divisible by 3 and 5.");
        for (int i = userNumA; i < userNumB; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.print(i);
                System.out.print(" ");
            }
        }

        System.out.println("\nThe following numbers are divisible by 6 or 7.");
        for (int i = userNumA; i < userNumB; i++){
            if(i % 6 == 0 || i % 7 == 0){
                System.out.print(i);
                System.out.print(" ");
            }
        }

        System.out.println("\nThe following numbers are not divisible by 3.");
        for (int i = userNumA; i < userNumB; i++){
            if(!(i % 3 == 0)){
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }
}
