package ca.ciccc.wmad202.assignment3.main;

import ca.ciccc.wmad202.assignment3.problem1.NumberAnalysis;
import ca.ciccc.wmad202.assignment3.problem2.Problem2;
import ca.ciccc.wmad202.assignment3.problem3.Problem3;
import ca.ciccc.wmad202.assignment3.problem4.Problem4;
import ca.ciccc.wmad202.assignment3.problem5.Problem5_1;
import ca.ciccc.wmad202.assignment3.problem5.StringAnalysis;

public class Main {
    public static void main(String[] args) {

        System.out.println("Main");

        NumberAnalysis num = new NumberAnalysis();
        num.evaluate(1);
        num.evaluate(2);
        num.evaluate(3);
        num.evaluate(4);
        num.evaluate(5);

        Problem2 pr2 = new Problem2();
        pr2.problem2();

        Problem3 pr3 = new Problem3();
        pr3.problem3();

        Problem4 pr4 = new Problem4();
        pr4.problem4();

        StringAnalysis str = new StringAnalysis();
        str.evaluate(1);
        str.evaluate(2);
        str.evaluate(3);
        str.evaluate(4);
        str.evaluate(5);

    }


}
