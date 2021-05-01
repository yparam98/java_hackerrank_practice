package Stdin_Stdout_Part_2;

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);

        int whole = 0;
        double floating = 0.00;
        String string = "";

        try {
            whole = scanner.nextInt();
        } catch (Exception exception) {
            whole = -1;
        }

        if (scanner.hasNext()) scanner.nextLine();

        try {
            floating = scanner.nextDouble();
        } catch (Exception exception) {
            floating = -1;
        }

        if (scanner.hasNext()) scanner.nextLine();

        string = scanner.nextLine();

        if (!string.equals("")) System.out.println("String: " + string);
        if (floating != -1) System.out.println("Double: " + floating);
        if (whole != -1) System.out.println("Int: " + whole);
    }
}
