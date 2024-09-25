/* 3. Write a program that takes a double value from the user, casts it to an integer, and displays both the original double value and the cast integer value (explicit casting).
Then, take an integer input from the user, store it in a double variable, and print both values to demonstrate implicit casting. */

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a double value: ");
        double dval = sc.nextDouble();

        int ival = (int)dval;  // Explicit type casting

        System.out.println("\n------------Explicit Type Casting------------");
        System.out.println("Original double value: " + dval);
        System.out.println("After explicit casting integer value: " + ival);

        System.out.println("---------------------------------------------");

        System.out.print("\nEnter an integer value: ");
        int ival1 = sc.nextInt();

        double dval1 = ival1;

        System.out.println("\n------------Implicit Type Casting------------");
        System.out.println("Original integer value: " + ival1);
        System.out.println("After implicit casting double value: " + dval1);

        sc.close();
    }
}
