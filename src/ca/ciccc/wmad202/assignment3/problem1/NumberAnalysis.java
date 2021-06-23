package ca.ciccc.wmad202.assignment3.problem1;

public class NumberAnalysis {
    public static void evaluate(int option){
        switch (option){
            case 1: Problem1_1.run();break;
            case 2: Problem1_2.run();break;
            case 3: Problem1_3.run();break;
            case 4: Problem1_4.run();break;
            case 5: Problem1_5.run();break;
            default: System.out.println("Option is not valid");
        }
        }

}
