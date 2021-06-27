package com.company;

public class Main {

    public static void main(String[] args) {
	    double firstValue;
	    double secondValue;

//  Initialise variables
        firstValue = 22;
        secondValue = 7;

//  Entering one operator: +, -, /, *
	    String operator = "*";

//  Entering operator Min or Max
	    String operatorMinMax = "Min";

//  Print out results
        System.out.println("Arithmetic result: " + doArithmetic(firstValue, secondValue, operator));

        System.out.println("Min or Max result: " + operatorMinMax + " = " + minMaxFunction(firstValue, secondValue, operatorMinMax));


    }

//  Methode 1: calculation
    public static double doArithmetic(double firstNumber, double secondNumber, String operator){
        double answer = 0;
        switch (operator) {
            case "+":
                answer = firstNumber + secondNumber;
                return answer;
            case "-":
             answer = firstNumber - secondNumber;
                return answer;
            case "*":
             answer = firstNumber * secondNumber;
                return answer;
            case "/":
             answer = firstNumber / secondNumber;
                return answer;
            // if none of the cases worked
            default:
                System.out.println("Enter a valid operator");
                break;
        }
        return answer;

    }
//  HOME TASK: create a method that checks two numbers and uses a switch to return max, min

    //  Methode 2: finding Min or Max  values
    public static double minMaxFunction (double minMax1, double minMax2, String operator){
        double answer = 0;
        switch (operator){
            case "Min":
                answer = Math.min(minMax1, minMax2);
                return answer;
            case "Max":
                answer = Math.max(minMax1, minMax2);
                return answer;
        }
    return answer;
    }

}
