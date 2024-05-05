//Given a square matrix, calculate the absolute difference between the sums of its diagonals.
//
//For example, the square matrix  is shown below:
//
//1 2 3
//4 5 6
//9 8 9  
//The left-to-right diagonal = . The right to left diagonal = . Their absolute difference is .
//
//Function description
//
//Complete the  function in the editor below.
//
//diagonalDifference takes the following parameter:
//
//int arr[n][m]: an array of integers
//Return
//
//int: the absolute diagonal difference
//Input Format
//
//The first line contains a single integer, , the number of rows and columns in the square matrix .
//Each of the next  lines describes a row, , and consists of  space-separated integers .
//
//Constraints
//
//Output Format
//
//Return the absolute difference between the sums of the matrix's two diagonals as a single integer.
//
//Sample Input
//
//3
//11 2 4
//4 5 6
//10 8 -12
//Sample Output
//
//15
//Explanation
//
//The primary diagonal is:
//
//11
//   5
//     -12
//Sum across the primary diagonal: 11 + 5 - 12 = 4
//
//The secondary diagonal is:
//
//     4
//   5
//10
//Sum across the secondary diagonal: 4 + 5 + 10 = 19
//Difference: |4 - 19| = 15
//
//Note: |x| is the absolute value of x
package StacksAndQueues;

import IntevewQuestSolutionHacker.Result;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author kalim
 */
public class Solution7 {
    

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        int n = arr.size();
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            primaryDiagonalSum += arr.get(i).get(i);
            secondaryDiagonalSum += arr.get(i).get(n - 1 - i);
        }
        return Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
    }

}

 class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(
                Arrays.stream(bufferedReader.readLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(ArrayList::new, ArrayList::add, ArrayList::addAll)
            );
        }

        int result = Solution7.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

    

