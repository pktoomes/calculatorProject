package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        String numOne = scanner.nextLine();
        double operand1 = Double.parseDouble(numOne);
        System.out.println("Number: " + operand1 + ".  Please enter another number:");
        String numTwo = scanner.nextLine();
        double operand2 = Double.parseDouble(numTwo);
        System.out.println("Number: " + operand1 + ".  Number: " + operand2);

        double sum = operand1 + operand2;

        double difference = operand1 - operand2;

        double division = operand1 / operand2;

        double multiplication = operand1 * operand2;

        double remainder = operand1 % operand2;

        showResults(sum, difference, division, multiplication, remainder );
    }
    public static void showResults (double Sum, double Difference, double Division, double Multiplication, double Remainder ){
        System.out.println("The sum is "+ Sum);
        System.out.println("The difference is " + Difference);
        System.out.println("The first number divided by the second number is " + Division);
        System.out.println("The numbers multiplied is " + Multiplication);
        System.out.println("The remainder is " + Remainder);
    }
}
