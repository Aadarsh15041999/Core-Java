/* 10. Leap Year Checker
Input a year from the user and determine if it's a leap year using conditional statements. */

 import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year (in yyyy format): ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        sc.close();
    }
}