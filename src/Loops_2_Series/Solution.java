package Loops_2_Series;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Pattern space_pattern = Pattern.compile("\s");

        // get number of queries
        int number_of_queries = scanner.nextInt();
        String[][] queries = new String[number_of_queries][3];
        scanner.nextLine();

        // get queries
        for (int current_query = 0; current_query < number_of_queries; current_query++)
        {
            queries[current_query] = space_pattern.split(scanner.nextLine());
        }

        for (String[] query_line_arr : queries)
        {
            // calculate and print the series
            calculate_series(
                    Integer.parseInt(query_line_arr[0]),
                    Integer.parseInt(query_line_arr[1]),
                    Integer.parseInt(query_line_arr[2])
            );
        }
    }

    private static void calculate_series(int a, int b, int n)
    {
        int total = 0;
        int counter = 1;
        total += a;

        for (int index = 0; index < n; index++)
        {
            total += b*counter;
            System.out.format("%d ", total);
            counter+=counter;
        }

        // new line separating each series
        System.out.println();
    }
}
