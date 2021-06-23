package ca.ciccc.wmad202.assignment3.problem2;

import java.util.Scanner;

public class Problem2 {
    public static void problem2(){
//        Scanner in = new Scanner(System.in);
        System.out.println(" X |  1   2   3   4   5   6   7   8   9  10");
        System.out.println("-------------------------------------------");

        int multi;
        for(int i = 1; i < 11; i++){
            System.out.printf("%2d" ,i);
            System.out.print(" |");
            for (int j = 1; j < 11; j++){
                multi = i * j;
                System.out.printf("%3d" ,multi);
                System.out.print(" ");
            }
            System.out.println("");
        }




    }
}
