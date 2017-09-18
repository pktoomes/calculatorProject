package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        String numOne = scanner.nextLine();
        double operand1 = Double.parseDouble(numOne);
        System.out.println("Number: "+ operand1 + ".  Please enter another number:");
        String numTwo = scanner.nextLine();
        double operand2 = Double.parseDouble(numTwo);
        System.out.println("Number: "+ operand1 + ".  Number: " + operand2);

    }
}
