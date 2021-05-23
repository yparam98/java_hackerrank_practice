package StaticInitializers;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static short B = 0, H = 0;
    private static boolean flag = true;

    static {
        final Scanner scanner = new Scanner(System.in);
        B = scanner.nextShort();
        H = scanner.nextShort();

        try {
            if (B <= 0 || H <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception exception) {
            System.out.println(exception.toString());
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }//end of main

}//end of class


