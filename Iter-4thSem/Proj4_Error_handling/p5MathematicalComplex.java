package Proj4_Error_handling;

import java.util.Scanner;

public class p5MathematicalComplex {
	public static void main(String []args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a value for x:");
    String inputX = scanner.nextLine();

    try {
        double x = Double.parseDouble(inputX);

        // Perform complex mathematical computations
        double result = Math.sin(x) + Math.log(x);

        System.out.println("Result of complex computation: " + result);
    } catch (NumberFormatException e) {
        System.out.println("Error: Invalid input for x. Please enter a valid number.");
    } catch (NullPointerException e) {
        System.out.println("Error: NullPointerException occurred during computation.");
    }
}
}