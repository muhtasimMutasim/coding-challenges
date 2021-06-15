package Challenges;

import java.nio.charset.StandardCharsets;
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.security.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static Challenges.Main.extraFormatting;


public class LeetCode {

/* ------------------------------ Partitioning Into Minimum Number Of Deci-Binary Numbers ----------------------------------------------- */

    public static int minPartitions(String n) {
        char best = '0';
        for (char c : n.toCharArray()) {
            System.out.println("'" +c+ "' byte: " + c + "  Best Value: " + best);
            if (c > best) {
                best = c;
            }
        }
        return best - '0';
    }


    public static void minPartitionsTests() {
        String n = "32", a = "82734";
        String target = a;
        int value = minPartitions(target);
        System.out.println("'" + target + "' to binary: " + value);
    }


/* ------------------------------ Partitioning Into Minimum Number Of Deci-Binary Numbers ----------------------------------------------- */



    public static void reverseString(char[] s) {

        //Collections.reverseOrder(Arrays.asList().toArray(new char[][]{s}));

        System.out.println(s);

    }


    public static void reverseStringTest() {
            char[] test = {'h', 'e', 'l', 'l', 'o'};
        reverseString(test);
    }





    public static void main( String[] args ) throws IOException {
        extraFormatting("Leet Code Challenege (Start) ");


        //minPartitionsTests();
        reverseStringTest();



        extraFormatting("Leet Code Challenege ( Complete) ");

    }



}
