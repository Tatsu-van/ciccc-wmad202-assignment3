package ca.ciccc.wmad202.assignment3.problem1;

import java.util.Scanner;

public class Problem1_4 {
    public static void run(){
        Scanner in = new Scanner(System.in);
        // Problem1.3
        System.out.println("\n\n-------Problem1.3------\n");

        System.out.print("Please enter a number: ");
        int userNum = in.nextInt();
        String binaryNum = Integer.toBinaryString(userNum);

        System.out.printf("Converting your number \"%d\" to binary is %s" ,userNum, binaryNum);

        // Problem1.4
        System.out.println("\n\n-------Problem1.4------\n");

        int max = -100000 * 1000000;
        int min = 100000 * 100000;
        String userStrNum = "";
        int distance = 0;
        boolean validNum = true;
        while (validNum = true) {
            System.out.print("Please enter a number: ");
            userStrNum = in.next();
            int startIndex = userStrNum.charAt(0) == '-' ? 1 : 0;

            for(int i = startIndex; i < userStrNum.length(); i++){
                if(!(Character.isDigit(userStrNum.charAt(i)))){
                    System.out.println("invalid!");
                    validNum = false;
                    break;
                }

            }
            if(!validNum){
                break;
            }
            else{
                int userDigitNum = Integer.parseInt(userStrNum);
                if (userDigitNum > max){
                    max = userDigitNum;
                }
                if (userDigitNum < min){
                    min = userDigitNum;
                }
            }
        }

        distance = Math.abs((max - min));
        System.out.printf("The maximum number that your has entered is: %d\n" ,max);
        System.out.printf("The minimum number that your has entered is: %d\n" ,min);
        System.out.printf("The distance between max and min is: %d" ,distance);
    }
}
