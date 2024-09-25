/* 9. Simple Calculator
Write a program that simulates a simple calculator, taking two numbers and an operator (+, -, *, /, %) from the user and performing the appropriate operation. */

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n======== Simple Calculator ========\n");
        
        // Variable to control the loop
        boolean continueCalculator = true;

        while (continueCalculator) {
            System.out.print("Enter number 1: ");
            int num1 = sc.nextInt();
            
            System.out.print("Enter number 2: ");
            int num2 = sc.nextInt();
            
            System.out.print("\nEnter an operator (+, -, *, /, %): ");
            char operator = sc.next().charAt(0);

            System.out.println("\n");

            // Variable to store the result
            double result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("The result is: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("The result is: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("The result is: " + result);
                    break;
                case '/':
                    // Check if the second number is zero before division
                    if (num2 != 0) {
                        result = (double) num1 / num2;  // Use explicit casting for floating-point division
                        System.out.println("The result is: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                case '%':
                    // Check if the second number is zero before modulo operation
                    if (num2 != 0) {
                        result = num1 % num2;
                        System.out.println("The result is: " + result);
                    } else {
                        System.out.println("Error: Modulo by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid operator. Please use +, -, *, /, or %.");
                    break;
            }

            System.out.print("\nDo you want to perform another calculation? (yes/no): ");
            String response = sc.next();
            System.out.println("\n");

            // Check if the user wants to exit
            if (response.equalsIgnoreCase("no")) {
                continueCalculator = false;
                System.out.println("Exiting the calculator.");
            }
        }

        sc.close();
    }
}