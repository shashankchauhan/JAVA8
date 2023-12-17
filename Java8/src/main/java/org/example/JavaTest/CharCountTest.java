package org.example.JavaTest;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharCountTest {

    public static void main(String[] args) {

        String s = "This is Char count";

        Map<Character,Long> cCount = s.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(
                Function.identity(),Collectors.counting()));

        System.out.println("Count ="+cCount);
    }
}
