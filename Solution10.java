//Given a double-precision number,Payment , denoting an amount of money, use the NumberFormat class' getCurrencyInstance method to convert Payment into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:
//
//US: formatted Payment
//India: formatted Payment
//China: formatted Payment
//France: formatted Payment
//where formatted Payment  is Payment  formatted according to the appropriate Locale's currency.
//
//Note: India does not have a built-in Locale, so you must construct one where the language is en (i.e., English).
//
//Input Format
//
//A single double-precision number denoting Payment .
//
//Constraints
//0<=Payment<=10**9
//Output Format
//
//On the first line, print US: u where  u is Payment  formatted for US currency.
//On the second line, print India: i where  i is Payment  formatted for Indian currency.
//On the third line, print China: c where c is  Payment formatted for Chinese currency.
//On the fourth line, print France: f, where  is Payment  formatted for French currency.
//
//Sample Input
//
//12324.134
//Sample Output
//
//US: $12,324.13
//India: Rs.12,324.13
//China: ￥12,324.13
//France: 12 324,13 €
//Explanation
//
//Each line contains the value of Payment formatted according to the four countries' respective currencies.      
package HackerRankCode;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author kalim
 */
public class Solution10 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Formatting for US currency
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String us = usFormat.format(payment);

        // Formatting for Indian currency
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        String india = indiaFormat.format(payment);

        // Formatting for Chinese currency
        Locale chinaLocale = Locale.CHINA;
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(chinaLocale);
        String china = chinaFormat.format(payment);

        // Formatting for French currency
        Locale franceLocale = Locale.FRANCE;
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(franceLocale);
        String france = franceFormat.format(payment);

        // Printing the formatted values
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

    

