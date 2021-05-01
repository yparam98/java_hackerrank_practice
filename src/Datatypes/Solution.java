package Datatypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number_of_test_cases = 0;

        try {
            number_of_test_cases = scanner.nextInt();
            if (number_of_test_cases < 1)
                throw new Exception();
        } catch (Exception exception) {
            System.exit(0);
        }

        scanner.nextLine();

        String[] test_cases = new String[number_of_test_cases];

        for (int index = 0; index < number_of_test_cases; index++)
        {
            test_cases[index] = scanner.nextLine();
        }

        for (String test_case : test_cases)
        {
            if (test_case.charAt(0) == '-' || Character.isDigit(test_case.charAt(0)))
            {
                long number = 0;
                ArrayList<String> results = new ArrayList<>();

                // first try to see if it'll fit in long. if it doesn't then no point trying rest.
                try
                {
                    number = Long.parseLong(test_case);
                    results.add("* long");
                } catch (Exception exception)
                {
                    System.out.println(test_case + " can't be fitted anywhere.");
                    continue;
                }

                if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE)
                {
                    results.add("* int");
                }
                if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE)
                {
                    results.add("* short");
                }
                if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE)
                {
                    results.add("* byte");
                }

                Collections.reverse(results);

                System.out.println(test_case + " can be fitted in:");
                for (String result : results)
                {
                    System.out.println(result);
                }
            }
        }
    }
}