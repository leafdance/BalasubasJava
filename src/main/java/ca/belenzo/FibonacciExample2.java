package ca.belenzo;

/*
* Print Fibonacci Series using Recursion
*/
public class FibonacciExample2 {

    static int n1 = 1, n2 = 1, n3 = 0;

    static int printFibonacci (int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3 + "\n");
            System.out.println("\n Count " + count + "  n1 : " + n1 + ", n2 : " + n2 + ", n3 : " + n3 + "\n");
            printFibonacci(count - 1);
        }
        return n3;

    }

    public static void main(String[] args) {
        int count = 10;
        int finalFibonacci = 0;
        System.out.print(n1 + " " + n2);
        finalFibonacci = printFibonacci(count - 2);
        System.out.print("finalFibonacci is " + finalFibonacci);
    }

}
