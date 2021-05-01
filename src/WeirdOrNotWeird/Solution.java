package WeirdOrNotWeird;

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        final Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number >= 1 && number <= 100)
        {
            if (number % 2 == 0) // if number is even
            {
                if (number >= 2 && number <= 5)
                {
                    System.out.println("Not Weird");
                }
                else if (number >= 6 && number <= 20)
                {
                    System.out.println("Weird");
                }
                else
                {
                    System.out.println("Not Weird");
                }
            }
            else // if number if odd
            {
                System.out.println("Weird");
            }
        }
    }
}
