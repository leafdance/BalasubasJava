package ca.belenzo.modern.java.data;

import java.util.Arrays;
import java.util.List;

public class StudentDatabase {

    public static List<Student> getAllStudents() {

        Student student1 = new Student("Jimi", 4.3, 4, "Male", Arrays.asList("Soccer", "Basketball", "Volleyball"));
        Student student2 = new Student("Shandra", 4.2, 4, "Female", Arrays.asList("Soccer", "Volleyball", "Gymnastics"));

        Student student3 = new Student("Alyona", 4.3, 2, "Female", Arrays.asList("Soccer", "Volleyball", "Swimming"));
        Student student4 = new Student("Georgina", 3.9, 2, "Female", Arrays.asList("Dancing", "Volleyball", "Gymnastics"));

        Student student5 = new Student("Chloe", 4.1, 9, "Female", Arrays.asList("Soccer", "Baseball", "Volleyball", "Gymnastics"));
        Student student6 = new Student("Cassandra", 4.2, 9, "Female", Arrays.asList("Dancing", "Volleyball", "Futsal", "Gymnastics"));

        Student student7 = new Student("Yzo", 3.8, 5, "Female", Arrays.asList("Basketball", "Baseball", "Volleyball", "Gymnastics"));
        Student student8 = new Student("Julia", 4.0, 3, "Female", Arrays.asList("Dancing", "Volleyball", "Futsal", "Drama"));

        return Arrays.asList(student1, student2, student3, student4, student5, student6, student7, student8);
    }

}
