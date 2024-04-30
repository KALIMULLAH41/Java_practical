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
public class Sum1 {
    public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        int sum = calculateDigitSum(number);
        System.out.println("Sum of digits: " + sum);
        
        scanner.close();
    }
    
    public static int calculateDigitSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10; // Add the last digit to sum
            num /= 10; // Remove the last digit
        }
        return sum;
    }
}
