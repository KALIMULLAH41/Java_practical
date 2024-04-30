
//Write which accept some integer using scanner class and display their sum in case numbers passes are less then two the 
//program should display the message please pass at least 2 numbers

package LoopExample;

import java.util.Scanner;

/**
 *
 * @author kalim
 */
public class LengthPropertyDemo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the integers separated by spaces: ");
        String input = scanner.nextLine();

        String[] numbers = input.split("\\s+");

        if (numbers.length < 2) {
            System.out.println("Please pass at least 2 numbers.");
        } else {
            int sum = 0;
            for (String num : numbers) {
                sum += Integer.parseInt(num);
            }
            System.out.println("Sum of the numbers: " + sum);
        }

        scanner.close();
    }
}
   

