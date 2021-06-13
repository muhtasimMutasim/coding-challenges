package Challenges;



import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.security.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;


public class DataStructuresChallenges {



    /* --------------------------- 1221. Split a String in Balanced Strings ()      ---------------------------------------- */

    public static int balancedStringSplit(String s) {
        int stringLength = s.length();

        int status=0;//what is the status of substring untill now
        int count=0;

        for(int i=0;i<s.length();i++){
            char letter = s.charAt(i);

            int status_before = status;
            int status_after_calc = status;

            if(s.charAt(i)=='R'){
                status++;
                status_after_calc = status;
            }else{
                status--;
                status_after_calc = status;
            }

            String mess = MessageFormat.format("Current Letter: {0}\nStatus Initial:    {1}\nStatus After Calc: {2}", letter, status_before, status_after_calc);
            System.out.println(mess);
            System.out.println("Count Value: " + count);
            if(status==0){///when status is 0 -> means number of L and R are equal
                count++;//count it in
                //also status will be reset for next substring
                System.out.println("Status (second if statement): " + status + "\nCount Value: " + count);
            }
            System.out.println("\n");
        }
        return count;
    }

    public static void balancedStringSplitMain() {

        String result;
        String t1, t2, t3, t4, t5;
        t1 = "RLRRLLRLRL";
        t2 = "RLLLLRRRLR";
        t3 = "LLLLRRRR";
        t4 = "RLRRRLLRLL";

        //result = MessageFormat.format("\nTest Case: {0}\nResult: {1}\n", t1, balancedStringSplit(t1) );
        result = MessageFormat.format("\nTest Case: {0}\nResult: {1}\n", t2, balancedStringSplit(t2) );
        //result = MessageFormat.format("\nTest Case: {0}\nResult: {1}\n", t3, balancedStringSplit(t3) );
        //result = MessageFormat.format("\nTest Case: {0}\nResult: {1}\n", t4, balancedStringSplit(t4) );
        //result = balancedStringSplit( t1 );
        // r = balancedStringSplit(  );

        System.out.println( result );


    }


    /* --------------------------- 1221. Split a String in Balanced Strings ()      ---------------------------------------- */








}
