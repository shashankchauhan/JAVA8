package org.example.JavaTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortDecimalNumberTests {

    public static void main(String[] args) {

        List<Double> d = Arrays.asList(12.45, 465.456,75.24,541.514,45.12);
        d.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
