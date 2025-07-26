package ca.belenzo.modern.java.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> predicate0 = (i) -> { return i % 2 == 0; };
    static Predicate<Integer> predicate1 = (i) -> i % 2 == 0;
    static Predicate<Integer> predicate2 = (i) -> i % 5 == 0;

    public static void predicateAnd() {
        System.out.println("Result in predicateAnd : " + predicate1.and(predicate2).test(10));
    }

    public static void predicateOr() {
        System.out.println("Result in predicateOr : " + predicate0.and(predicate2).test(4));
    }

    public static void predicateNegate() {
        System.out.println("Result in predicateNegate : " + predicate1.and(predicate2).negate().test(4));
    }

    public static void main(String[] args) {
        System.out.println("Result in predicate0 : " + predicate0.test(2));
        System.out.println("Result in predicate1 : " + predicate1.test(3));
        predicateAnd();
        predicateOr();
        predicateNegate();
    }

}
