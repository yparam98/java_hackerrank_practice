package FileIO;

import java.util.ArrayList;
import java.util.Scanner;

public class EndOfFile
{
    public static void main(String[] args)
    {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) arrayList.add(scanner.nextLine());
        } catch (Exception ignored){}

        int index = 1;
        for (String string : arrayList) {
            System.out.format("%d %s\n", index++, string);
        }
    }
}
