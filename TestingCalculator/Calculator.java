package TestingCalculator;

import java.util.Scanner;

public class Calculator {
    enum Operations {
        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE,
        EXPONENT
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your equation:");

        String equation = input.nextLine();

        String trimmedEquation = equation.replaceAll("\\s+","");

        System.out.println(trimmedEquation.split(""));
        String[] splitEquation = trimmedEquation.split("");

        for (int i = 0; i < splitEquation.length; i++) {
            System.out.println(splitEquation[i]);
        }
    }
}
