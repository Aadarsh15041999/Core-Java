/* 7. Greatest of Two Numbers
Input two numbers from the user and print the greater number using conditional statements. */

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is greater.");
        } else {
            System.out.println(num2 + " is greater.");
        }        

        sc.close();
    }
}
