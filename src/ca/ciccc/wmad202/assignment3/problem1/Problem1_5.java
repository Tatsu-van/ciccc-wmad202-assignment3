package ca.ciccc.wmad202.assignment3.problem1;

import java.util.Scanner;

public class Problem1_5 {
    public static void run(){
        Scanner in = new Scanner(System.in);

        // Problem1.5
        System.out.println("\n\n-------Problem1.5------\n");

        int f1;
        int f2;
        int result = 0;
        for(int i = 2; i < 100; i++){
            f1 = (int) Math.pow(2, i);
            f2 = (int) Math.pow(i,5);

            if(f1 >= f2) {
                System.out.printf("2^%d = %d, %d^5 = %d",i,f1,i,f2);
                result = i;
                break;
            }
        }

        System.out.printf("\nThe numberT is: %d\n" ,result);
    }
}