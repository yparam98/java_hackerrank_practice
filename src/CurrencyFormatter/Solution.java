package CurrencyFormatter;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat us_currency = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india_currency = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat china_currency = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france_currency = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        if (payment > 0 && payment < Math.pow(10, 9)) {
            System.out.println("US: " + us_currency.format(payment));
            System.out.println("India: " + india_currency.format(payment));
            System.out.println("China: " + china_currency.format(payment));
            System.out.println("France: " + france_currency.format(payment));
        }
    }
}