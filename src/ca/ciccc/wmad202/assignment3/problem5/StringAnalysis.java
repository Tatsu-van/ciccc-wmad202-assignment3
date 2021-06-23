package ca.ciccc.wmad202.assignment3.problem5;

public class StringAnalysis {
    public static void evaluate(int option){
        switch (option){
            case 1: Problem5_1.run();break;
            case 2: Problem5_2.run();break;
            case 3: Problem5_3.run();break;
            case 4: Problem5_4.run();break;
            case 5: Problem5_5.run();break;
            default: System.out.println("Option is valid");
        }
    }
}

