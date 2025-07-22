package org.example.optional;

import java.util.Optional;

public class OptionalExamples {
    public static void main(String[] args) {
        // Example 1: Creating Optional using of()
        Optional<String> opt1 = Optional.of("Hello");
        System.out.println("opt1: " + opt1.get());

        // Example 2: Creating empty Optional
        Optional<String> opt2 = Optional.empty();
        System.out.println("opt2 isPresent: " + opt2.isPresent());

        // Example 3: Creating Optional using ofNullable()
        Optional<String> opt3 = Optional.ofNullable(null);
        System.out.println("opt3 isPresent: " + opt3.isPresent());

        // Example 4: ifPresent()
        opt1.ifPresent(val -> System.out.println("Value is present: " + val));
        opt2.ifPresent(val -> System.out.println("This won't print"));

        // Example 5: orElse()
        String result1 = opt2.orElse("Default Value");
        System.out.println("orElse: " + result1);

        // Example 6: orElseGet()
        String result2 = opt2.orElseGet(() -> "Generated Value");
        System.out.println("orElseGet: " + result2);

        // Example 7: orElseThrow()
        try {
            opt2.orElseThrow(() -> new RuntimeException("No value present"));
        } catch (Exception e) {
            System.out.println("orElseThrow: " + e.getMessage());
        }

        // Example 8: map()
        Optional<Integer> lengthOpt = opt1.map(String::length);
        System.out.println("Length of opt1: " + lengthOpt.orElse(0));

        // Example 9: flatMap()
        Optional<String> opt4 = Optional.of("Java");
        Optional<Integer> flatMapped = opt4.flatMap(s -> Optional.of(s.length()));
        System.out.println("flatMap result: " + flatMapped.orElse(0));
    }
}

