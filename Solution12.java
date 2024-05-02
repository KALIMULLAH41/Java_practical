//"A string is traditionally a sequence of characters, either as a literal constant or as some kind of variable." — Wikipedia: String (computer science)
//
//This exercise is to test your understanding of Java Strings. A sample String declaration:
//
//String myString = "Hello World!"
//The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.
//
//Given two strings of lowercase English letters, A and  B, perform the following operations:
//operation:
//Sum the lengths A of B and .
//Determine if A  is lexicographically larger than B (i.e.: does B come before A in the dictionary?).
//Capitalize the first letter in A and B and print them on a single line, separated by a space.
//Input Format
//
//The first line contains a string A . The second line contains another string B. The strings are comprised of only lowercase English letters.
//
//Output Format
//
//There are three lines of output:
//For the first line, sum the lengths of A and B.
//For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
//For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.
//
//Sample Input 0
//
//hello
//java
//Sample Output 0
//
//9
//No
//Hello Java
//Explanation 0
//
//String A is "hello" and B is "java".
//
//A has a length of 5, and B has a length of 4; the sum of their lengths is 9.
//When sorted alphabetically/lexicographically, "hello" precedes "java"; therefore, A is not greater than B and the answer is No.
//
//When you capitalize the first letter of both A and B and then print them separated by a space, you get "Hello Java".
package HackerRankCode;

import java.util.Scanner;

/**
 *
 * @author kalim
 */
public class Solution12 {
    



    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        // Calculate the sum of lengths of strings A and B
        int sumLengths = A.length() + B.length();
        System.out.println(sumLengths);
        
        // Check if A is lexicographically greater than B
        String lexResult = A.compareTo(B) > 0 ? "Yes" : "No";
        System.out.println(lexResult);
        
        // Capitalize the first letters of A and B
        String capitalizedA = capitalizeFirstLetter(A);
        String capitalizedB = capitalizeFirstLetter(B);
        System.out.println(capitalizedA + " " + capitalizedB);
        
        sc.close();
    }
    
    // Function to capitalize the first letter of a string
    public static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }
}




    

