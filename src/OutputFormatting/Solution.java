package OutputFormatting;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Pattern space_pat = Pattern.compile(" ");
        String[][] items = new String[3][2];

        for (int index = 0; index < 3; index++)
        {
            String[] splits = space_pat.split(scanner.nextLine());
            items[index][0] = splits[0];
            items[index][1] = splits[1];
        }

        System.out.println("================================");
        for (String[] kv : items)
        {
            System.out.printf("%-15s%s\n",kv[0], repeat_chars(3, "0", kv[1]));
        }
        System.out.println("================================");
    }

    private static String repeat_chars(int cap, String filler, String incoming_str)
    {
        StringBuilder new_str = new StringBuilder();
        for (int index = incoming_str.length(); index < cap; index++)
        {
            new_str.append(filler);
        }

        new_str.append(incoming_str);

        return new_str.toString();
    }
}