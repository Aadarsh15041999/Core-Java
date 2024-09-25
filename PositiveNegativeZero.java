/* 5. Positive, Negative, or Zero
Write a program that takes an integer input and prints whether it is positive, negative, or zero. */

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        if (num < 0)
            System.out.println(num + " is a Negative integer.");
        else if (num > 0)
            System.out.println(num + " is a Positive integer.");
        else
            System.out.println("Entered input is Zero.");

        sc.close();
    }
}
