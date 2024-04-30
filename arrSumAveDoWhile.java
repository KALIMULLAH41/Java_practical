//write a java program to create an array of 'n' integers where  n is given by the user.Then ask the user to input Value in that array and finally display the 
//sum and average of all the number entered by the user? usinge while  loop
//

package LoopExample;

import java.util.Scanner;

/**
 *
 * @author kalim
 */
public class arrSumAveDoWhile {
    public static void main(String args[]){
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter Size of array :");
        int n =kb.nextInt();
        int arr []= new int[n];
        int sum=0,count=0;
        double ave;
        System.out.println("Enter a Element of array :");
        do{
            arr[count]=kb.nextInt();
            sum=sum+arr[count];
            count++;
        }while(count<n);
        System.out.println("Sum of the number :"+sum);
        System.out.println("Average of the number :"+sum/n);
    }
    
}
