package org.example.lambda;

import java.util.ArrayList;
import java.util.List;

/*
Example 1: Using lambda expression to iterate over a List and perform some action on list items
          In the given example, we are iterating over the list and printing all the list elements in the standard output. We can perform any desired operation in place of printing them.
*/
public class LambdaListIterate {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");

        list.forEach(p -> System.out.println("Printing List Values "+p));
    }
}
