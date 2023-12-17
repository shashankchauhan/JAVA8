package org.example.JavaTest;

import java.util.Scanner;

public class StringReverseTest {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String reverse = scanner.nextLine();

        StringBuffer sb = new StringBuffer();
        sb.append(reverse);
        System.out.println("Reverse of String is "+sb.reverse());

        String nstr=""; char ch;

        for(int i=0;i<reverse.length();i++)
        {
            ch = reverse.charAt(i);
            nstr =ch+nstr;
        }
        System.out.println("Reversed word: "+ nstr);



    }

}
