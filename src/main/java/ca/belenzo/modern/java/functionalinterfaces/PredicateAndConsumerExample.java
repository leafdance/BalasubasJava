package ca.belenzo.modern.java.functionalinterfaces;

import java.util.function.Predicate;
import ca.belenzo.modern.java.data.Student;
import ca.belenzo.modern.java.data.StudentDatabase;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class PredicateAndConsumerExample {

    static Predicate<Student> studentPredicate1 = (s) -> s.getGradeLevel() >= 3;
    static Predicate<Student> studentPredicate2 = (s) -> s.getGpa() >= 4.0;

    BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name + " : " + activities);

    Consumer<Student> studentConsumer = (student) -> {
        if (studentPredicate1.and(studentPredicate2).test(student)) {
            studentBiConsumer.accept(student.getName(), student.getActivities());
        }
    };

    public void printNameAndActivities(List<Student> students) {
        students.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> students = StudentDatabase.getAllStudents();
        new PredicateAndConsumerExample().printNameAndActivities(students);
    }
}
