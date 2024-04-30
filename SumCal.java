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
public class SumCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.println("Enter numbers (enter 0 to finish):");

        while ((number = scanner.nextInt()) != 0) {
            sum += number;
        }

        System.out.println("Sum of all numbers entered before 0: " + sum);
    }
}
