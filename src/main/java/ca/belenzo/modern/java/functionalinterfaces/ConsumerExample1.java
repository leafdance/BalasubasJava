package ca.belenzo.modern.java.functionalinterfaces;

import java.util.function.Consumer;

public class ConsumerExample1 {

    public static void main(String[] args) {

        // Consumar as @FunctionalInterface has accept() Single Abstract Method (SAM) with void (no return type).
        Consumer<String> consumer1 = (s) -> System.out.println("\n" + s.toUpperCase());
        consumer1.accept("james magno");

    }

}
