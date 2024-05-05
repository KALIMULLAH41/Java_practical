//Given an array of integers, find the sum of its elements.
//
//For example, if the array , , so return .
//
//Function Description
//
//Complete the simpleArraySum function in the editor below. It must return the sum of the array elements as an integer.
//
//simpleArraySum has the following parameter(s):
//
//ar: an array of integers
//Input Format
//
//The first line contains an integer, , denoting the size of the array.
//The second line contains  space-separated integers representing the array's elements.
//
//Constraints
//
//
//Output Format
//
//Print the sum of the array's elements as a single integer.
//
//Sample Input
//
//6
//1 2 3 4 10 11
//Sample Output
//
//31
//Explanation
//
//We print the sum of the array's elements: .
package StacksAndQueues;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


 
public class Solution4 {





    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int sum = 0;
        for (int num : ar) {
            sum += num;
        }
        return sum;
    }
}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Arrays.stream(bufferedReader.readLine().trim().split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        int result = Solution4.simpleArraySum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


    
    