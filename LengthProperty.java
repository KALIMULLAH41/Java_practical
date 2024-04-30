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
public class LengthProperty {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the integers separated by spaces: ");
        String input = scanner.nextLine();

        String[] numbers = input.split("\\s+");

        if (numbers.length < 2) {
            System.out.println("Please pass at least 2 numbers.");
        } else {
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += Integer.parseInt(numbers[i]);
            }
            System.out.println("Sum of the numbers: " + sum);
        }

        scanner.close();
    }
}
    

