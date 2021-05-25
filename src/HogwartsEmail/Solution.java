package HogwartsEmail;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String isValid(String email) {
        String valid = "No";
        Pattern email_validator = Pattern.compile("^[a-z]{5}@hogwarts\\.com$");
        if (email_validator.matcher(email).find())
        {
            valid = "Yes";
        }

        return valid;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = isValid(s);
        System.out.println(result);
        in.close();
    }
}