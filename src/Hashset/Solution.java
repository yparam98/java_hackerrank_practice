package Hashset;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt(); // number of pairs
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

//        HashSet<String> pair_lefts = new HashSet<>(Arrays.asList(pair_left));
//        HashSet<String> pair_rights = new HashSet<>(Arrays.asList(pair_right));
//
//        for (int index = 1; index <= pair_lefts.size()*pair_rights.size(); index++)
//        {
//            System.out.println(index);
//        }
//
        ArrayList<String> done = new ArrayList<>();

        int counter = 0;
        for (int index = 0; index < t; index++)
        {
            String pair_str = pair_left[index] + " " + pair_right[index];
            if (!done.contains(pair_str))
            {
                ++counter;
                done.add(pair_str);
            }
            System.out.println(counter);
        }

        //Write your code here


    }
}
