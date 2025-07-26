package ca.belenzo;

import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {

        String a, b = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String to Palindrome Check: ");
        a =  scanner.nextLine();
        int n = a.length();
        for (int i  = n - 1; i >= 0; i--) {
            b = b + a.charAt(i);
            System.out.println("b is now --> " + b);
        }
        if (a.equalsIgnoreCase(b)) {
            System.out.println("The String is a Palindrome");
        } else {
            System.out.println("The String is NOT a Palindrome");
        }
    }

}
