//Skyline Real Estate Developers is planning to demolish a number of old, unoccupied buildings and construct a shopping mall in their place. Your task is to find the largest solid area in which the mall can be constructed.
//
//There are a number of buildings in a certain two-dimensional landscape. Each building has a height, given by . If you join  adjacent buildings, they will form a solid rectangle of area .
//
//Example
//
//A rectangle of height  and length  can be constructed within the boundaries. The area formed is .
//
//Function Description
//
//Complete the function largestRectangle int the editor below. It should return an integer representing the largest rectangle that can be formed within the bounds of consecutive buildings.
//
//largestRectangle has the following parameter(s):
//
//int h[n]: the building heights
//Returns
//- long: the area of the largest rectangle that can be formed within the bounds of consecutive buildings
//
//Input Format
//
//The first line contains , the number of buildings.
//The second line contains  space-separated integers, each the height of a building.
//
//Constraints
//
//Sample Input
//
//STDIN       Function
//-----       --------
//5           h[] size n = 5
//1 2 3 4 5   h = [1, 2, 3, 4, 5]
//Sample Output
//
//9
//Explanation
//
//An illustration of the test case follows.
//image
package StacksAndQueues;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 *
 * @author kalim
 */
public class Solution1 {
  
    public static long largestRectangle(List<Integer> h) {
        Stack<Integer> stack = new Stack<>();
        long maxArea = 0;
        int n = h.size();
        
        for (int i = 0; i <= n; i++) {
            int height = (i == n) ? 0 : h.get(i);
            
            while (!stack.isEmpty() && h.get(stack.peek()) > height) {
                int topHeightIndex = stack.pop();
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, (long) h.get(topHeightIndex) * width);
            }
            
            stack.push(i);
        }
        
        return maxArea;
    }
}

 class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> h = Arrays.stream(bufferedReader.readLine().split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        long result = Solution1.largestRectangle(h);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

    

