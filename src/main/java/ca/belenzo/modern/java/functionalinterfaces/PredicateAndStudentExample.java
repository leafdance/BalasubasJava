package ca.belenzo.modern.java.functionalinterfaces;

import ca.belenzo.modern.java.data.Student;
import ca.belenzo.modern.java.data.StudentDatabase;

import java.util.function.Predicate;
import java.util.function.Function;
import java.util.List;
import java.util.stream.Collectors;

public class PredicateAndStudentExample {

    static Predicate<Student> predicateStudent1 = (s) -> s.getGradeLevel() > 3;
    static Predicate<Student> predicateStudent2 = (s) -> s.getGpa() >= 3.8;

    static Function<Integer, Predicate<Integer>> gradePredicate = (toCompare) -> (number) -> number > toCompare;
    static Function<Double, Predicate<Double>> gpaPredicate = (toCompare) -> (number) -> number > toCompare;

    public static void main (String[] args) {

        List<Student> listOfStudents = StudentDatabase.getAllStudents();

        List<Student> filteredStudentList = listOfStudents.stream()
                .filter(PredicateAndStudentExample.predicateStudent1)
                .collect(Collectors.toList());

        System.out.println("listOfStudents -> " + listOfStudents);
        System.out.println("filteredStudentList -> " + filteredStudentList);

        listOfStudents.forEach(
                (student -> {
                    if (predicateStudent1.test(student)) {
                        System.out.println(student);
                    }
                })
        );

        boolean result = gradePredicate.apply(2).test(5) && gpaPredicate.apply(3.6).test(3.9);
        System.out.println("Result from Predicates -> " + result);

    }

}
