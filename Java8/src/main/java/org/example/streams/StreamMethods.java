package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods  {
    public static void main(String[] args) {

        //filter(predicate) boolean value function, predicate is interface
        List<String> list = Arrays.asList("shashank","nisith","radhika","saloni");

        List<String> newList = list.stream().filter(e -> e.startsWith("s")).collect(Collectors.toList());
        System.out.println(newList);


        //map(Function) works on value
        List<Integer> numb = Arrays.asList(1,54,13,46,46,17);
        List<Integer> newNum =   numb.stream().map(i->i*i).collect(Collectors.toList());

        newNum.stream().sorted().forEach(System.out::println);

        Integer it = newNum.stream().min((x,y) -> x.compareTo(y)).get();
        System.out.println("compareTo getting min value using comparing = "+it);

        Integer itMax = newNum.stream().max((x,y) -> x.compareTo(y)).get();
        System.out.println("compareTo getting max value using comparing = "+itMax);


        System.out.println(newNum);
    }
}
