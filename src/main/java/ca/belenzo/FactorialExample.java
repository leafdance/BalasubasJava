package ca.belenzo;

import java.util.Scanner;

public class FactorialExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to compute Factorial for : ");
        int number = scanner.nextInt();
        scanner.close();

        long factorial = 1;
        int i = number;
        while (i >= 1) {
            factorial = factorial * i;
            i--;
        }

        System.out.println("Factorial for " + number + " is " + factorial);
    }
}
