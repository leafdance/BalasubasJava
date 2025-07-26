package ca.belenzo.modern.java.functionalinterfaces;

import ca.belenzo.modern.java.data.StudentDatabase;
import ca.belenzo.modern.java.data.Student;
import java.util.function.BiConsumer;
import java.util.List;
import java.util.function.Consumer;

public class BiConsumerExample {

    public static void nameAndActivities() {
        BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name + " : " + activities);

        Consumer<String> stringConsumer = (name) -> System.out.println("Name is : " + name);

        List<Student> students = StudentDatabase.getAllStudents();

        students.forEach((student) -> studentBiConsumer.accept(student.getName(), student.getActivities()));
    }

    public static void main(String[] args) {

        BiConsumer<String, String> biConsumerPrint = (a, b) -> {
            System.out.println("PRINT  a : " + a + ", b S: " + b);
        };
        biConsumerPrint.accept("java 7", "java 8");

        BiConsumer<Integer, Integer> biConsumerMultiply = (a, b) -> {
            System.out.println("MULTIPLY  a : " + a + ", b : " + b + " --> " + (a * b));
        };

        BiConsumer<Integer, Integer> biConsumerAdd = (a, b) -> {
            System.out.println("ADD  a : " + a + ", b : " + b + " --> " + (a + b));
        };

        BiConsumer<Integer, Integer> biConsumerDivide = (a, b) -> {
            System.out.println("DIVIDE  a : " + a + ", b : " + b + " --> " + (a / b));
        };

        biConsumerMultiply.andThen(biConsumerAdd).andThen(biConsumerDivide).accept(10, 5);

        nameAndActivities();

    }

}
