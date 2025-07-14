package ca.belenzo.modern.java.imperativevsdeclarative;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample1 {

    public static void main(String[] args) {

        // Sum of Integers for the range of 0 to 100
        // Imperative "How To" Style of Programming
        int sum0 = 0;
        for (int i = 0; i <= 100; i++) {
            // sum0 += i;
            sum0 = sum0 + i;
        }
        System.out.println("Sum of Integers for the range of 0 to 100");
        System.out.println("Imperative \"How To\" Style of Programming");
        System.out.println("Sum is " + sum0);

        System.out.println(" ");

        // Declarative "Describe What" Style of Programming
        // Sum of Integers for the range of 0 to 100
        int sum1 = IntStream.rangeClosed(0, 100)
                .parallel()
                //.map(x -> new Integer(x))
                .sum();
        System.out.println("Sum of Integers for the range of 0 to 100");
        System.out.println("Declarative \"Describe What\" Style of Programming");
        System.out.println("Sum is " + sum1);

        System.out.println(" ");

        int[] arr = {1, 2, 3, 4, 5};
        IntStream.range(0, arr.length)
                .map(i -> arr[arr.length - 1 - i])
                .forEach(System.out::println); // 5 4 3 2 1

    }

}
