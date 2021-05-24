package TagContentExtractor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution{
    public static void main(String[] args) throws IOException
    {
        ArrayList<String> test_cases = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();

        BufferedReader fileReader = new BufferedReader(new FileReader("input02.txt"));
        int number_of_lines = Integer.parseInt(fileReader.readLine());

        for (int index = 0; index < number_of_lines; index++)
        {
            test_cases.add(fileReader.readLine());
        }

        fileReader.close();

        for (String line : test_cases)
        {
            System.out.println(line);
//            results.add(get_tag(line));
        }
    }

    private static String get_tag(String line)
    {
        String result = "";

        if (!line.isEmpty()) {
            Pattern tag_matcher = Pattern.compile("<(..*)>(.*)</(.*)(?:\\1)>");
            Matcher matching_tags = tag_matcher.matcher(line);

            while (matching_tags.find()) {
                result = matching_tags.group(2);
                matching_tags = tag_matcher.matcher(result);
            }
        }

        if ((result.equals(line) || result.isEmpty()) || result.contains("<") || (result.length() > Math.pow(10, 4))) {
            return "Nope";
        } else {
            return result;
        }
    }
}