package Multiples;

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int multiplier = scanner.nextInt();

        if (multiplier >= 2 && multiplier <= 20)
        {
            for (int index = 1; index <= 10; index++)
            {
                System.out.format("%d x %d = %d\n", multiplier, index, (multiplier*index));
            }
        }
    }
}
