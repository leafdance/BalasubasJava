package ca.belenzo.modern.java.lambda;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static int compareTwoIntegers(Comparator<Integer> integerComparator, int x, int y) {
        System.out.println("Inside compareTwoInteger() method");
        System.out.println("integerComparator.compare(" + x + ", " + y + ")");
        return integerComparator.compare(x, y);
    }

    public static void main(String[] args) {

        Comparator<Integer> comparator0 = new Comparator<>(){
            public int compare(Integer i1, Integer i2) {
                // return 0 -> if both are equal
                // return 1 -> if i1 > i2
                // return -1 -> if i1 < i2
                return i1.compareTo(i2);
            }
        };
        System.out.println("Prior to Java 8, Old Style");
        System.out.println("comparator0.compare(99, 88) -> " + comparator0.compare(99, 88));
        System.out.println(" ");

        // Prior to Java 8
        Comparator<Integer> lambdaComparator1 = (Integer a, Integer b) -> a.compareTo(b);
        System.out.println("In Java 8, Modern Java Style");
        System.out.println("comparator1.compare(88, 99) -> " + lambdaComparator1.compare(88, 99));
        System.out.println(" ");

        Comparator<Integer> lambdaComparator2 = (a,b) -> a.compareTo(b);
        System.out.println("In Java 8, Modern Java Style");
        System.out.println("comparator2.compare(88, 88) -> " + lambdaComparator2.compare(88, 88));
        System.out.println(" ");

        // Comparator chaining happens only when the first comparator result is zero
        System.out.println("Comparator chaining happens only when the first comparator result is zero");
        System.out.println("Result if chaining comparators with equal inputs -> " + lambdaComparator1.thenComparing(lambdaComparator1).compare(22, 22));
        System.out.println(" ");

        System.out.println("Result if chaining comparators with not equal inputs -> " + lambdaComparator2.thenComparing(lambdaComparator2).compare(33, 22));
        System.out.println(" ");

        System.out.println("Result using compareTwoIntegers() method -> " + compareTwoIntegers(lambdaComparator2,22, 33));
        System.out.println(" ");

    }

}
