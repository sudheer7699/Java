package Day10;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}

public class Comparator_String {

    public static void main(String[] args) {

        // Create a list of students
        List<Student> std = new ArrayList<Student>();
        std.add(new Student(22, "sunny"));
        std.add(new Student(21, "nani"));
        std.add(new Student(24, "bunny"));
        std.add(new Student(22, "bunty"));
        std.add(new Student(32, "bhai"));

        System.out.println("Before Sorting:");
        for (Student s : std) {
            System.out.println(s);
        }

        // Create a Comparator to sort by age
        Comparator<Student> studentComparator = new Comparator<Student>() {
            public int compare(Student i, Student j) {
                return Integer.compare(i.age, j.age); // Handles <, =, >
            }
        };

        // Sort using the comparator
        Collections.sort(std, studentComparator);

        System.out.println("\nAfter Sorting by Age:");
        for (Student s : std) {
            System.out.println(s);
        }
    }
}