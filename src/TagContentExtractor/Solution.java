package TagContentExtractor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Solution{
    public static void main(String[] args)
    {
        try {
            String[] test_cases = get_cases("src/TagContentExtractor/input01.txt");
            Stream.of(test_cases).forEach(line -> Stream.of(get_tag(line)).forEach(System.out::println));
        } catch (IOException ioException) {
            System.out.println("Error reading data: " + ioException.getLocalizedMessage());
        } catch (Exception exception) {
            System.out.println("Error processing data: " + exception.toString());
        }
    }

    private static String[] get_cases(String file_name) throws IOException
    {
        BufferedReader fileReader = new BufferedReader(new FileReader(file_name));
        int number_of_lines = Integer.parseInt(fileReader.readLine());

        String[] test_cases = new String[number_of_lines];

        for (int index = 0; index < number_of_lines; index++)
        {
            test_cases[index] = (fileReader.readLine());
        }

        fileReader.close();

        return test_cases;
    }

    private static String[] get_tag(String line)
    {
        String[] split_strings = line.split("<|>");
        ArrayList<String> results = new ArrayList<>();

        for (int index = 0; index < split_strings.length; index++)
        {
            if (!split_strings[index].isEmpty()
                    && index+2 < split_strings.length
                    && !split_strings[index+1].isEmpty()
                    && !split_strings[index+2].isEmpty()
            )
            {
                if (split_strings[index+2].substring(1).equals(split_strings[index]))
                {
                    results.add(split_strings[index+1]);
                }
            }
        }

        if (results.isEmpty())
        {
            results.add("None");
        }

        return results.toArray(String[]::new);
    }
}