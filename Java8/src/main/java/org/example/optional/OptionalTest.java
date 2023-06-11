package org.example.optional;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {

        String s= "Optional example" ;

        Optional<String> optional =Optional.ofNullable(s);

        System.out.println(optional.get()); // if value is null this throw Exception saying no value present and terminate
        System.out.println(optional.isPresent());
        System.out.println(optional.orElse("no value in this object"));
    }
}
