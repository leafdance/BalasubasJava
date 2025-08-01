package ca.belenzo.modern.java.data;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private int gradeLevel;
    private double gpa;
    private String gender;


    public Student(String name, double gpa, int gradeLevel, String gender, List<String> activities) {
        this.name = name;
        this.gpa = gpa;
        this.gradeLevel = gradeLevel;
        this.gender = gender;
        this.activities = activities;
    }

    List<String> activities = new ArrayList<>();

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradeLevel=" + gradeLevel +
                ", gpa=" + gpa +
                ", gender='" + gender + '\'' +
                '}';
    }

}
