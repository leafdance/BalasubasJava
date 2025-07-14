package ca.belenzo.modern.java.imperativevsdeclarative;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeExample2 {

    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(1, 1, 2, 2, 2, 3,3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10);

        // Remove the duplicates from the list
        // Imperative "How To" Style of Programming
        List<Integer> uniqueList0 = new ArrayList<>();
        for (Integer i : listOfIntegers) {
            if (!uniqueList0.contains(i)) {
                uniqueList0.add(i);
            }
        }
        System.out.println("Remove the duplicates from the list");
        System.out.println("Imperative \"How To\" Style of Programming");
        System.out.println("uniqueList0 : " + uniqueList0);

        System.out.println(" ");

        // Declarative "Describe What" Style of Programming
        // Remove the duplicates from the list
        List<Integer> uniqueList1 = listOfIntegers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Remove the duplicates from the list");
        System.out.println("Declarative \"Describe What\" Style of Programming");
        System.out.println("uniqueList1 : " + uniqueList1);

    }

}
