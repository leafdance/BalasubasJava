package ca.belenzo.modern.java.functionalinterfaces;

import ca.belenzo.modern.java.data.Student;
import ca.belenzo.modern.java.data.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {

    static Consumer<Student> consumer2 = (student) -> System.out.println(student);
    static Consumer<Student> consumer3 = (student) -> System.out.print(student.getName());
    static Consumer<Student> consumer4 = (student) -> System.out.println(student.getActivities());


    public static void printStudents() {
        System.out.println("ConsumerExample2 printStudents()");
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach(consumer2);
    }

    public static void printStudentNamesAndActivities() {
        System.out.println("ConsumerExample2 printStudentNamesAndActivities()");
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach(consumer3.andThen(consumer4));
    }

    public static void printStudentNamesAndActivitiesUsingCondition() {
        System.out.println("ConsumerExample2 printStudentNamesAndActivitiesUsingCondition()");
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach(student -> {
            if (student.getGradeLevel() <= 3 && student.getGpa() > 3.9){
                consumer3.andThen(consumer4).accept(student);
            }
        });
    }

    public static void main(String[] args) {

        Consumer<String> consumer1 = (s) -> System.out.println("\n" + s.toUpperCase());
        consumer1.accept("james magno");
        System.out.println(" ");
        printStudents();
        System.out.println(" ");
        printStudentNamesAndActivities();
        System.out.println(" ");
        printStudentNamesAndActivitiesUsingCondition();
        System.out.println(" ");
    }

}