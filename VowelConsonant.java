/* 6. Check Vowel or Consonant
Take a character input from the user and check if it's a vowel or consonant using conditional statements. */

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an alphabetic character: ");
        char ch = sc.next().charAt(0);

        if (ch == 'A' || ch =='a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u')
            System.out.println("'" + ch + "'" + " is a vowel");
        else
            System.out.println("'" + ch + "'" + " is a consonant");

        sc.close();
    }
}
