package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        // Filter
        List<Integer> filterList = list.stream().filter(integer -> integer % 2 ==0).collect(Collectors.toList());
        System.out.println("filterList- "+filterList);

        //Sorted
        List<String> listString = Arrays.asList("hello","world","goodbye");
        List<String> sortedList= listString.stream().sorted().collect(Collectors.toList());
        System.out.println("sortedList- "+sortedList);

        //Aggregating
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("sum- "+sum);


    }
}
