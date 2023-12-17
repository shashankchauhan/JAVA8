package org.example.JavaTest;

import java.util.Arrays;
import java.util.List;

public class MultipleNumberTests {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(12,5,55,50,89,99,125);

        number.stream().filter(n -> n%5 ==0).forEach(System.out::println);
    }
}
