/* 4. Check Even or Odd
Take an integer from the user and use conditional statements to check if it is even or odd. */

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        
        if(num % 2 == 0){
            System.out.println(num + " is an Even number");
        } else{
            System.out.println(num + " is an Odd number");
        }

        sc.close();
    }
}
