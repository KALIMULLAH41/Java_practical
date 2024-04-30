
package LoopExample;

import java.util.Scanner;

/**
 *
 * @author kalim
 */
public class SumArray {
     public static void main(String args[]){
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter Size array :");
        int n =kb.nextInt();
        int arr[]=new int[n];
        int sum=0;
        
        System.out.println("Enter array element :");
        
        for(int i=0;i<n;i++){
            arr[i]=kb.nextInt();
            sum =sum+arr[i];
            
        }
        System.out.println("Sum of the numbers :"+sum);
       
    }
    
    
}
