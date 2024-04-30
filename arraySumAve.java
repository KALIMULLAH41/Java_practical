//write a java program to create an array of 'n' integers where  n is given by the user.Then ask the user to input Value in that array and finally display the 
//sum and average of all the number entered by the user? usinge while  loop
//

package LoopExample;

import java.util.Scanner;

/**
 *
 * @author kalim
 */
public class arraySumAve {
    public static void main(String args[]){
       Scanner kb =new Scanner(System.in );
       System.out.println("Enter size array ");
       int n = kb.nextInt();
       int arr[]=new  int [n];
       int  sum=0;
       int count =0;
       double ave ;
       System.out.println("Enter the element of the array :");
       while(count<n){
           arr[count]=kb.nextInt();
           sum=sum+arr[count];
           count++;      
       }
       ave=sum/n;
       System.out.println("Sum of the numbers :"+sum);
       System.out.println("average of the numbers :"+ave);
    }
    
}
