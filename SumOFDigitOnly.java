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
public class SumOFDigitOnly {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        
        // Extracting the first and last digits
        int firstDigit = String.valueOf(num).charAt(0) - '0';
        int lastDigit = num % 10;
        
        // Calculating the sum of the first and last digits
        int sum = firstDigit + lastDigit;
        
        System.out.println("Sum of the first and last digit: " + sum);
    }
    
}
