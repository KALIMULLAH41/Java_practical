/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoopExample;

import java.util.Scanner;

/**
 *
 * @author kalim
 */
public class SumOfDigit {
     public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = kb.nextInt();

        // Calculate the sum of digits
        int sumOfDigits = calculateSumOfDigits(number);

        // Display the result
        System.out.println("Sum of digits of " + number + " is: " + sumOfDigits);

        kb.close();
    }

    // Method to calculate the sum of digits of a number
    private static int calculateSumOfDigits(int number) {
        // Initialize sum to 0
        int sum = 0;

        // Iterate through each digit of the number
        while (number != 0) {
            // Get the last digit (rightmost digit) of the number
            int digit = number % 10;

            // Add the digit to the sum
            sum += digit;

            // Remove the last digit from the number
            number /= 10;
        }

        // Return the calculated sum of digits
        return sum;
    }
}
  

