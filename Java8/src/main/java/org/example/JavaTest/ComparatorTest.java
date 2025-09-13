package org.example.JavaTest;

import java.util.*;

// Student class for demonstration
class StudentComp {
    private String name;
    private int age;

    public StudentComp(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class ComparatorTest {
    public static void main(String[] args) {
        List<StudentComp> students = new ArrayList<>();
        students.add(new StudentComp("tom", 22));
        students.add(new StudentComp("Dick", 20));
        students.add(new StudentComp("Harry", 25));

        // Sort by name using Comparator (anonymous class)
        students.sort(new Comparator<StudentComp>() {
            @Override
            public int compare(StudentComp s1, StudentComp s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });
        System.out.println("Sorted by name: " + students);

        // Sort by age using Comparator (lambda)
        students.sort((s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()));
        System.out.println("Sorted by age: " + students);
    }
}
