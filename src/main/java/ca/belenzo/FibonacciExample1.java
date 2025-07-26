package ca.belenzo;

/*
 * Print Fibonacci Series using Iteration
 */
public class FibonacciExample1 {

    public static void main(String[] args) {
        int count = 10;
        int n1 = 1, n2 = 1;
        int next = 0;
        int fibAtCount = 0;

        System.out.print("Fibonacci Series of " + count + " numbers: ");

        for (int i = 0; i < count; i++) {
            System.out.print(n1);

            if (i < count - 1) {
                System.out.print(", ");
            }

            next = n1 + n2;
            fibAtCount = n1;
            n1 = n2;
            n2 = next;

        }

        System.out.println("\nFibonacci at Count " + count + " is " + fibAtCount); // Line break after loop
        System.out.println("Last Fibonacci number printed: " + n1);
        System.out.println("Next Fibonacci number would be: " + n2);
    }

}
