package santhoshhhhhh;

import java.util.Scanner;

public class Arithmeticoperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter the First number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the Second number: ");
        double num2 = scanner.nextDouble();
        
        // Perform arithmetic operations 
        double sum = num1 + num2;
        double difference = num1 - num2;  // Renamed variable 'jam' to 'difference' for clarity
        double product = num1 * num2;
        double quotient = (num2 != 0) ? num1 / num2 : Double.NaN;
        double remainder = (num2 != 0) ? num1 % num2 : Double.NaN;

        System.out.println("\nResults of Arithmetic operators:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        scanner.close();
    }
}
