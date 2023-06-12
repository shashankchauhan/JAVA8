package org.example.streams;

import java.util.stream.Stream;

public class StreamObject {

    public static void main(String[] args) {

        //Empty stream
        Stream<Object> obj = Stream.empty();

        String name[] = {"shashank","nisith","radhika","saloni"};

        Stream<String> stream1 = Stream.of(name);
        stream1.forEach(e -> {System.out.println(e);});

    }

}
