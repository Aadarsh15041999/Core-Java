/* 2. Unary Operations
Write a program that takes an integer from the user and applies both pre-increment and post-increment operators. Display the result. */

import java.util.Scanner;

public class UnaryOperation {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        System.out.println("----------Unary Operations----------");

        int preIncrement = ++num;
        System.out.println("Result on pre-increment: " + preIncrement);

        int postIncrement = num++;
        System.out.println("Result on post-increment: " + postIncrement);

        System.out.println("Value after post-increment operation is applied: " + num);
        
        sc.close();
    }
}
