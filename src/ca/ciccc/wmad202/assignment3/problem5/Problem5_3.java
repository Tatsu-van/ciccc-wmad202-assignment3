package ca.ciccc.wmad202.assignment3.problem5;

import java.util.Scanner;

public class Problem5_3 {
    public static void run() {

        double piEstimate100 = piEstimate(100);
        System.out.println("Estimate for pi for 100 tries: " + piEstimate100);

        double piEstimate1000 = piEstimate(1000);
        System.out.println("Estimate for pi for 1000 tries: " + piEstimate1000);

        double piEstimate10000 = piEstimate(10000);
        System.out.println("Estimate for pi for 10000 tries: " + piEstimate10000);

    }

    public static double piEstimate(int tries){
        final int TRIES = tries;
        int hits = 0;

        for (int i = 1; i <= TRIES; i++){

            double r = Math.random();
            double x = -1 + 2 * r;
            r = Math.random();
            double y = -1 + 2 * r;

            if (x * x + y * y <= 1){
                hits = hits + 1;
            }
        }

        double piEstimate = 4.0 * hits / TRIES;

        return piEstimate;

    }
}
