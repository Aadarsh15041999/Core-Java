/* 1. Simple Arithmetic Operations
Write a program that takes two integers from the user and prints the sum, difference, product, quotient and remainder using arithmetic operators. */

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter integer 2: ");
        int num2 = sc.nextInt();

        System.out.println("----------Arithmetic Operations----------");
        System.out.println("Sum of integers: " + (num1 + num2));
        System.out.println("Difference of integers: " + (num1 - num2));
        System.out.println("Product of integers: " + (num1 * num2));
        System.out.println("Quotient of integers: " + (num1 / num2));
        System.out.println("Remainder of integers: " + (num1 % num2));

        sc.close();
    }
}