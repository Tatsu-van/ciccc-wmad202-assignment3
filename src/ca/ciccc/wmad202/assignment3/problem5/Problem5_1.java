package ca.ciccc.wmad202.assignment3.problem5;

import java.util.Scanner;

public class Problem5_1 {
    public static void run(){
        Scanner in = new Scanner(System.in);

        String userWord = null;
        int maxUpper = 0;
        int maxLower = 0;
        int resultUpper = 0;
        int resultLower = 0;
        String maxUpperWord = "";
        String maxLowerWord = "";


        while (true){
            System.out.print("Please enter a word: ");
            userWord = in.nextLine();
            if (userWord.isEmpty()){
                break;
            }
            resultUpper = countUpper(userWord);
            resultLower = countLower(userWord);

            if (resultUpper > maxUpper){
                maxUpper = resultUpper;
                maxUpperWord = userWord;
            }
            if (resultLower > maxLower){
                maxLower = resultLower;
                maxLowerWord = userWord;
            }
        }

        System.out.printf("The highest number of uppercase letters is: %s\n" ,maxUpperWord);
        System.out.printf("The highest number of uppercase letters is: %s\n" ,maxLowerWord);
    }

    public static int countUpper(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(Character.isUpperCase(c)){
                count++;
            }
        }
        return count;
    }
    public static int countLower(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(Character.isLowerCase(c)){
                count++;
            }
        }
        return count;
    }
}
