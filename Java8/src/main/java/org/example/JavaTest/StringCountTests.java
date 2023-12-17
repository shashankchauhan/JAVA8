package org.example.JavaTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringCountTests {

    public static void main(String[] args) {

        List<String> name = Arrays.asList("three","one","two","one");

        Map<String,Long> nameCount = name.stream().
                collect(
                        Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.print(nameCount);
    }

}
