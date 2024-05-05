//Complete the function solveMeFirst to compute the sum of two integers.
//
//Example
// a=7
// b=3
//Return 10.
//
//Function Description
//
//Complete the solveMeFirst function in the editor below.
//
//solveMeFirst has the following parameters:
//
//int a: the first value
//int b: the second value
//Returns
//- int: the sum of a and b
//
//Constraints
// 1<=a,b<=1000
//
//Sample Input
//
//a = 2
//b = 3
//Sample Output
//
//5
//Explanation
//2+3

package StacksAndQueues;

import java.util.Scanner;

/**
 *
 * @author kalim
 */
public class Solution3 {
    

    static int solveMeFirst(int a, int b) {
        // Compute the sum of two integers
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input from STDIN
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        // Compute the sum using solveMeFirst function
        int sum = solveMeFirst(a, b);
        
        // Print output to STDOUT
        System.out.println(sum);
        
        // Close the scanner
        scanner.close();
    }
}

    

