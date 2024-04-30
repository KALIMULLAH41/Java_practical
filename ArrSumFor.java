//write a java program to create an array of 'n' integers where  n is given by the user.Then ask the user to input Value in that array and finally display the 
//sum and average of all the number entered by the user? usinge while  loop
//

package LoopExample;

import java.util.Scanner;

/**
 *
 * @author kalim
 */
public class ArrSumFor {
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
        System.out.println("Average of the numbers :"+(float)sum/n);
    }
    
}
