package TagContentExtractor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Solution{
    public static void main(String[] args)
    {
        try {
            String[] test_cases = get_cases("src/TagContentExtractor/input02.txt");
            Stream.of(test_cases).forEach(line -> System.out.println(get_tag(line)));
        } catch (IOException ioException) {
            System.out.println("Error reading data: " + ioException.getLocalizedMessage());
        } catch (Exception exception) {
            System.out.println("Error processing data: " + exception.getLocalizedMessage());
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