package Challenges;

import java.util.*;
import java.io.*;
import java.text.*;
import java.util.concurrent.atomic.AtomicInteger;


public class HackerRank {


    public static String findNumber(List<Integer> arr, int k) {
        // Write your code here

        boolean exists;
        exists = arr.contains(k);
        if ( exists ) {
            return "YES";
        }
        else {
            return "NO";
        }

    }

    public static List<Integer> oddNumbers(int l, int r) {
        // Write your code here
        List<Integer> final_array = new ArrayList<>();

        for (int i = l; i <= r; i++) {

            int remainder = i % 2;
            if ( remainder == 0 ) {
                continue;
            }
            else {
                final_array.add(i);
            }
        }
        return final_array;
    }

    public static void TestCasesFindNumber() throws IOException {

        List<Integer> test1 = new ArrayList<>();
        test1.add(1); test1.add(2); test1.add(1); test1.add(3); test1.add(5);

        String result = findNumber(test1, 5);
        System.out.println( MessageFormat.format("\nResult: {0}\n", result) );

    }

    public static void TestCasesOddNumbers() throws IOException {

        List<Integer> test1 = new ArrayList<>();
        test1.add(1); test1.add(2); test1.add(1); test1.add(3); test1.add(5);

        List<Integer> result = oddNumbers(2, 5);
        System.out.println( MessageFormat.format("\nResult: {0}\n", result) );
    }


/* ----------------------------- diagonalDifference (Start) ------------------------------------- */

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here

        AtomicInteger leftToRight = new AtomicInteger(); // left to right
        AtomicInteger rightToLeft = new AtomicInteger(); // right to left
        AtomicInteger ld = new AtomicInteger(); // ld = left to right diagonal
        AtomicInteger rd = new AtomicInteger(); // rd = right to left diagonal

        arr.forEach( (row) -> {
            if ( row.size() < 2) { return; }
            if ( rightToLeft.get() == 0 && leftToRight.get() == 0) {
                rightToLeft.getAndAdd( row.size() - 1 ); // sets the right side equal to the
            }
            int left = row.get(leftToRight.get());
            int right = row.get(rightToLeft.get());

            ld.getAndAdd( left );  rd.getAndAdd( right );
            leftToRight.getAndAdd(1);
            rightToLeft.decrementAndGet();
        });
        int result = Math.abs( ld.get() - rd.get() );
        return result;
    }

    public static void diagonalDifferenceTests() {

        List<Integer> listOne = Arrays.asList(3,4,5);
        List<Integer> listTwo = Arrays.asList(9, 11, 15);
        List<Integer> listThree = Arrays.asList(13, 5, 8);
        List<List<Integer>> test = new ArrayList<List<Integer>>();
        test.add(listOne);  test.add(listTwo);  test.add(listThree);

       int result = diagonalDifference( test );
       System.out.println("\n\n\nDiagonal Differences: " +result+ "\n\n");

    }


/* ----------------------------- diagonalDifference (End)  ------------------------------------- */



/* ----------------------------- Simple Sum Array (Start)  ------------------------------------- */


    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int number = ar.stream().mapToInt(Integer::intValue).sum();
        return number;
    }


    public static void simpleArrayTest() {

        List<Integer> listOne = Arrays.asList(3,4,5,5,6);
        int result = simpleArraySum(listOne);
        System.out.println("\n\n\nSimple Array Result: " +result+ "\n\n");

    }




/* ----------------------------- Simple Sum Array (End)  ------------------------------------- */


/* ------------------------------ Min Max Sum () ----------------------------------------------- */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        if (arr.contains(0)) { // remove 0 if they exist
            arr.removeIf(integer -> integer.equals(0));
        }
        // Converts input List to Array to deal with numbers larger than 32 bits
        long[] new_arr = new long[5];
        new_arr = arr.stream().mapToLong(l -> l).toArray();
        // Created long arrays with single indexes for stream lambda.
        final long[] highest = {0};
        final long[] lowest = {0};
        // Storing maximum and minimum values
        long max = Arrays.stream(new_arr).max().getAsLong();
        long min = Arrays.stream(new_arr).min().getAsLong();
        // max_dup and min_dup are arrays with single indexes that account for duplicates
        final int[] max_dup = {0};
        final int[] min_dup = {0};

        // Streaming Lambda function that adds values to highest and lowest variables.
        Arrays.stream(new_arr).forEach( (num) -> {
            if (num != min || min_dup[0] >= 1) {
                highest[0] += num;
            } else { min_dup[0] += 1; }
            if (num != max || max_dup[0] >= 1) {
                lowest[0] += num;
            } else { max_dup[0] += 1; }
           });

        System.out.println(lowest[0] + " " + highest[0]);
    }


    public static void minMaxSumTest() {
        // Write your code here

        List<Integer> t1 = Arrays.asList(11, 2, 3, 4, 5);

        miniMaxSum(t1);

    }




/* ------------------------------ Min Max Sum () ----------------------------------------------- */


    public static void warmUpHackerRank() {

        // Insert Test Cases Here (Start)

        //balancedStringSplitMain();
        //warmUp();
        //simpleArrayTest();
        //diagonalDifferenceTests();
        minMaxSumTest();

        // Insert Test Cases Here (End)
    }





}
