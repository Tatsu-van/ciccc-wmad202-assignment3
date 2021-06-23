package ca.ciccc.wmad202.assignment3.problem3;

import java.util.Scanner;

public class Problem3 {
    public static void problem3(){
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a word: ");
        String userStr = in.next();

        if (isPalindrome(userStr)){
            System.out.printf("Your word \"%s\" is palindrome" ,userStr);
        }
        else {
            System.out.printf("Your word \"%s\" is NOT palindrome" ,userStr);
        }
    }

    public static boolean isPalindrome(String str){

        int n = str.length();
        for (int i = 0; i < (n/2); i++){
            if(str.charAt(i) != str.charAt(n - i - 1)){
                return false;
            }
        }
        return true;
    }
}
