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


/* ----------------------------- diagonalDifference (Start)  ------------------------------------- */

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



    public static void warmUpHackerRank() {

        // Insert Test Cases Here (Start)

        //balancedStringSplitMain();
        //warmUp();
        //simpleArrayTest();
        diagonalDifferenceTests();

        // Insert Test Cases Here (End)
    }





}
