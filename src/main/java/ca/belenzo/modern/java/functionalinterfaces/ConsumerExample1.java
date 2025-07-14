package ca.belenzo.modern.java.functionalinterfaces;

import java.util.function.Consumer;

public class ConsumerExample1 {

    public static void main(String[] args) {

        Consumer<String> cnsmr1 = (s) -> System.out.println("\n" + s.toUpperCase());
        cnsmr1.accept("james magno");

    }

}
