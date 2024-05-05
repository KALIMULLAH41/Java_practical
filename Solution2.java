//Given an integer array of size , find the maximum of the minimum(s) of every window size in the array. The window size varies from  to .
//
//For example, given , consider window sizes of  through . Windows of size  are . The maximum value of the minimum values of these windows is . Windows of size  are  and their minima are . The maximum of these values is . Continue this process through window size  to finally consider the entire array. All of the answers are .
//
//Function Description
//
//Complete the riddle function in the editor below. It must return an array of integers representing the maximum minimum value for each window size from  to .
//
//riddle has the following parameter(s):
//
//arr: an array of integers
//Input Format
//
//The first line contains a single integer, , the size of .
//The second line contains  space-separated integers, each an .
//
//Constraints
//
//
//
//Output Format
//
//Single line containing  space-separated integers denoting the output for each window size from  to .
//
//Sample Input 0
//
//4
//2 6 1 12
//Sample Output 0
//
//12 2 1 1
//Explanation 0
//
//Here  and 
//
//window size	window1	window2	window3	window4	maximum of all windows
//1	2	6	1	12	12
//2	2	1	1		2
//3	1	1			1
//4	1				1
//Sample Input 1
//
//7
//1 2 3 5 1 13 3
//Sample Output 1
//
//13 3 2 1 1 1 1
//Explanation 1
//
//Here  and 
//
//win size	w_1	w_2	w_3	w_4	w_5	w_6	w_7	maximum of all windows
//1	1	2	3	5	1	13	3	13
//2	1	2	3	1	1	3		3
//3	1	2	1	1	1			2
//4	1	1	1	1				1
//5	1	1	1					1
//6	1	1						1
//7	1							1
//Sample Input 2
//
//6
//3 5 4 7 6 2
//Sample Output 2
//
//7 6 4 4 3 2
//Explanation 2
//
//Here  and 
//
//win size	w_1	w_2	w_3	w_4	w_5	w_6	maximum of all windows
//1	3	5	4	7	6	2	7
//2	3	4	4	6	2		6
//3	3	4	4	2			4
//4	3	4	2				4
//5	3	2					3
//6	2						2

package StacksAndQueues;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author kalim
 */
public class Solution2 {
    

    // Complete the riddle function below.
    static long[] riddle(long[] arr) {
        int n = arr.length;
        long[] result = new long[n + 1];

        // Calculate left indices of elements
        Stack<Integer> stack = new Stack<>();
        long[] left = new long[n];
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        // Clear the stack for the next calculation
        stack.clear();

        // Calculate right indices of elements
        long[] right = new long[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        // Calculate the maximum of the minimum(s) for each window size
        for (int i = 0; i < n; i++) {
            long windowSize = right[i] - left[i] - 1;
            result[(int) windowSize] = Math.max(result[(int) windowSize], arr[i]);
        }

        // Fill in any missing values
        for (int i = n - 1; i >= 1; i--) {
            result[i] = Math.max(result[i], result[i + 1]);
        }

        // Prepare the final result array
        long[] finalResult = new long[n];
        for (int i = 1; i <= n; i++) {
            finalResult[i - 1] = result[i];
        }

        return finalResult;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        long[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();

        long[] res = riddle(arr);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);

            if (i != res.length - 1) {
                System.out.print(" ");
            }
        }

        scanner.close();
    }
}

    

