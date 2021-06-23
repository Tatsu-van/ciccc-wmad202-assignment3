package ca.ciccc.wmad202.assignment3.problem5;

import java.util.Scanner;

public class Problem5_4 {
    public static void run() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter yout Email: ");
        String userEmail = in.nextLine();

        boolean containsOneAtSign = false;
        boolean containsOneDot = false;
        boolean containsCCDomain = false;
        boolean validUserName = false;

        int atSignCount = countAtSign(userEmail);
        int dotSignCount = countDotSign(userEmail);
        boolean ccDomain = isValidDomain(userEmail);

        if(atSignCount == 1){
            containsOneAtSign = true;
        }
        if(dotSignCount == 1){
            containsOneDot = true;
        }
        if(ccDomain) {
            containsCCDomain = true;
        }

        int atSignIndex = userEmail.indexOf('@');
        String userName = new String(userEmail).substring(0, atSignIndex);
        boolean isValidUserName = isDigit(userName);

        if(isValidUserName){
            validUserName = true;
        }

        if(containsOneAtSign && containsOneDot && containsCCDomain && validUserName){
            System.out.println("Your Email address " + userEmail + "is valid");
        }
        else {
            System.out.println("Your Email address " + userEmail + "is NOT valid");
        }

    }

    public static int countAtSign(String email){
        int count = 0;

        for(int i = 0; i < email.length(); i++){
            if (email.charAt(i) == '@'){
                count++;
            }
        }
        return count;
    }

    public static int countDotSign(String email){
        int count = 0;

        for(int i = 0; i < email.length(); i++){
            if (email.charAt(i) == '.'){
                count++;
            }
        }
        return count;
    }

    public static boolean isValidDomain(String email){
        final String GMAIL = "gmail.com";
        String userDomain = new String(email);
        int atSignIndex = email.indexOf('@');
        userDomain = userDomain.substring(atSignIndex + 1);
        if(userDomain.equals(GMAIL)){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isDigit(String userName){
        for(int i = 0; i < userName.length(); i++){
            char userNameChar = userName.charAt(i);
            if(Character.isLetterOrDigit(userNameChar) || userNameChar == '_'){
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
