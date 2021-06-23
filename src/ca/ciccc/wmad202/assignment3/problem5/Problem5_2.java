package ca.ciccc.wmad202.assignment3.problem5;

import java.util.Scanner;

public class Problem5_2 {
    public static void run() {
        String userStr;
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a word: ");
        userStr = in.nextLine();
        boolean reslut = isPalindrome(userStr);
        System.out.println(reslut);
    }

    public static boolean isPalindrome(String str){

        int n = str.length();
        for (int i = 0; i < (n/2); i++){
            if(str.charAt(i) != str.charAt(n - i - 1)){
                char wrongChar1 = str.charAt(i);
                char wrongChar2 = str.charAt(n - i - 1);
                String newUserStr = new String(str);
                newUserStr = newUserStr.replace(wrongChar1, wrongChar2);
                if(isPalindromeAgain(newUserStr)){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        return true;

    }

    public static boolean isPalindromeAgain(String str){
        int n = str.length();
        for (int i = 0; i < (n/2); i++){
            if(str.charAt(i) != str.charAt(n - i - 1)){
                    return false;
                }
            }
        return true;
    }
}
