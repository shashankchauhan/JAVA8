package org.example.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {


        List <Integer> list  = Arrays.asList(1,5,8,6,3,0);
        System.out.println(list);

        // Stream is interface
        Stream<Integer> slist =  list.stream();
        List <Integer> evenList  = slist.filter( i -> i%2==0).collect(Collectors.toList());
        System.out.println(evenList);
        List <Integer> greaterList  = list.stream().filter( i -> i > 3).collect(Collectors.toList());
        System.out.println(greaterList);

    }
}
