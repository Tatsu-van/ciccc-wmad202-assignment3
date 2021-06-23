package ca.ciccc.wmad202.assignment3.problem4;

import java.util.Scanner;

public class Problem4 {
    public static void problem4(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your statement: ");
        String userFormula = in.nextLine();

        boolean containsValidBracket = false;
        boolean containsValidAlphabet = false;
        boolean containsValidOperator = false;
        boolean validNumberOfBracket = false;

        if(userFormula.contains("(") || userFormula.contains(")")) {
            boolean countBracket = countingBracket(userFormula);
            if (countBracket) {
                validNumberOfBracket = true;
            }
        }
        else {
            validNumberOfBracket = true;
        }

        for(int i = 0; i < userFormula.length(); i++){
            char charOfUserFormula = userFormula.charAt(i);
            if(Character.isLetter(charOfUserFormula)){
                int indexAlpha = i;
                if(isValidAlphabet(userFormula, indexAlpha)){
                    containsValidAlphabet = true;
                }
            }
            else if (isOperator(charOfUserFormula)){
                int indexOpe = i;
                if(isValidOperator(userFormula,indexOpe)){
                    containsValidOperator = true;
                }
            }
            else if(charOfUserFormula == '(' || charOfUserFormula == ')'){
                int indexBracket = i;
                if(isValidBracket(userFormula, indexBracket, charOfUserFormula)){
                    containsValidBracket = true;
                }
            }
        }

        if (!(userFormula.contains("(")) && !(userFormula.contains(")"))){
            containsValidBracket = true;
        }

        System.out.println(containsValidAlphabet + "containsValidAlphabet");
        System.out.println(containsValidBracket + "containsValidBracket");
        System.out.println(containsValidOperator + "containsValidOperator");

        if (containsValidBracket && containsValidAlphabet && containsValidOperator && validNumberOfBracket){
            System.out.printf("Your formula %s is valid" ,userFormula);
        }
        else {
            System.out.printf("Your formula %s is NOT valid" ,userFormula);

        }
    }


    public static boolean countingBracket(String formula){
        String checkedFormula = new String(formula);
        if(formula.startsWith(")")){
            return false;
        }
        if (formula.endsWith("(")){
            return false;
        }
        int countFront = 0;
        int countAfter = 0;
        for (int i = 0; i <checkedFormula.length(); i++){
            if (checkedFormula.charAt(i) == '('){
                countFront++;
            }
            if(checkedFormula.charAt(i) == ')'){
                countAfter++;
            }
        }
        if (countFront == countAfter){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isValidAlphabet(String formula, int index){
        String checkedFormula = new String(formula);
        boolean before = false;
        boolean after = false;
        if (index == 0){
            before = true;
            if (checkedFormula.charAt(index + 1) == ')' || isOperator(checkedFormula.charAt(index + 1))) {
                after = true;
            }
        }
        else if (index == checkedFormula.length() - 1){
            after = true;
            if (checkedFormula.charAt(index - 1) == '(' || isOperator(checkedFormula.charAt(index - 1))) {
                before = true;
            }
        }
        else {
            if (checkedFormula.charAt(index - 1) == '(' || isOperator(checkedFormula.charAt(index - 1))) {
                before = true;
            }
            if (checkedFormula.charAt(index + 1) == ')' || isOperator(checkedFormula.charAt(index + 1))) {
                after = true;
            }
        }

        if (before && after){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isValidOperator(String formula, int index){
        String checkedFormula = new String(formula);
        boolean before = false;
        boolean after = false;

        if (checkedFormula.charAt(index - 1) == ')'){
            before = true;
        }
        else if (Character.isLetter(checkedFormula.charAt(index-1))){
            before = true;
        }
        else {
            return false;
        }

        if (checkedFormula.charAt(index + 1) == '('){
            after = true;
        }
        else if (Character.isLetter(checkedFormula.charAt(index + 1))){
            after = true;
        }
        else {
            return false;
        }

        System.out.println("before " + before);
        System.out.println("after " + after);
        if(before && after){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isValidBracket(String formula, int index, char bracket){
        String checkedFormula = new String(formula);

        if(!(checkedFormula.contains("(") || checkedFormula.contains(")"))){
            return true;
        }

        boolean before = false;
        boolean after = false;

        if(bracket == '(') {
            if (index == 0){
                before = true;
            }
            else if (isOperator(checkedFormula.charAt(index - 1)) || checkedFormula.charAt(index - 1) == '('){
                before = true;
            }

            if (isOperator(checkedFormula.charAt(index + 1)) || checkedFormula.charAt(index + 1) == '(' || Character.isLetter(checkedFormula.charAt(index + 1))){
                after = true;
            }
            if (before && after){
                return true;
            }
            else {
                System.out.println("before1 " + before);
                System.out.println("after1 " + after);
                return false;
            }
        }
        else if(bracket == ')') {
            if (isOperator(checkedFormula.charAt(index - 1)) || checkedFormula.charAt(index - 1) == ')' || Character.isLetter(checkedFormula.charAt(index - 1))){
                before = true;
            }

            if (index == checkedFormula.length() - 1){
                after = true;
            }
            else if (isOperator(checkedFormula.charAt(index + 1)) || checkedFormula.charAt(index + 1) == ')'){
                after = true;
            }

            if (before && after){
                return true;
            }
            else {
                System.out.println("before2 " + before);
                System.out.println("after2 " + after);
                return false;
            }
        }
        else {
            System.out.println("before3 " + before);
            System.out.println("after3 " + after);
            return false;
        }
    }

    public static boolean isOperator(char c){
        if(c == '+' || c == '-' || c == '/' || c == '*' || c == '%'){
            return true;
        }
        return false;
    }
}


