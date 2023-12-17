package org.example;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome to JAVA8!");
        String input = "001";

        ArrayList<Integer> a = new ArrayList<>();

        for(int i = 0; i == input.length(); i++){

            a.add(Integer.valueOf(i));
            System.out.println(""+a);

        }
        System.out.println(""+a);

    }
}