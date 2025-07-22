package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args) {
        // Example 1: Creating a Stream from a List
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Alice");
        Stream<String> nameStream = names.stream();
        nameStream.forEach(System.out::println);

        // Example 2: Filtering elements
        List<String> filtered = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Filtered (starts with A): " + filtered);

        // Example 3: Mapping elements
        List<Integer> nameLengths = names.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println("Name lengths: " + nameLengths);

        // Example 4: Sorting elements
        List<String> sortedNames = names.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted names: " + sortedNames);

        // Example 5: Distinct elements
        List<String> distinctNames = names.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Distinct names: " + distinctNames);

        // Example 6: Limiting elements
        List<String> limitedNames = names.stream()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("Limited names: " + limitedNames);

        // Example 7: Skipping elements
        List<String> skippedNames = names.stream()
                .skip(2)
                .collect(Collectors.toList());
        System.out.println("Skipped names: " + skippedNames);

        // Example 8: Reducing elements
        Optional<String> concatenated = names.stream()
                .reduce((a, b) -> a + ", " + b);
        System.out.println("Concatenated names: " + concatenated.orElse(""));

        // Example 9: Collecting to a Set
        System.out.println("Names as Set: " + names.stream().collect(Collectors.toSet()));

        // Example 10: Using forEach terminal operation
        System.out.print("Names using forEach: ");
        names.stream().forEach(name -> System.out.print(name + " "));
        System.out.println();
    }
}

