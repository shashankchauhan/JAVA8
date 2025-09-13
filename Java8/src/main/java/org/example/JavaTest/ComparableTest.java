package org.example.JavaTest;

import java.util.*;

// Simple Student class implementing Comparable
class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Compare students by age
    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return age + " (" + name + ")";
    }
}

public class ComparableTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("bob", 22));
        students.add(new Student("Alice", 20));
        students.add(new Student("Charlie", 25));

        System.out.println("Before sorting: " + students);
        Collections.sort(students);
        System.out.println("After sorting by name: " + students);
    }
}
