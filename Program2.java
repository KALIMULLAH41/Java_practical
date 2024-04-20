package twoarray;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the number of classes and its student ");
		int  classes =kb.nextInt();
		System.out.println("Enter the number backlog ");
		int student =kb.nextInt();
		boolean [][]arr=new boolean[classes][student];
		for(int i=0;i<=arr.length-1;i++) {
		  for(int j=0;j<=arr[i].length-1;j++) {
			System.out.println("Enter the number:"+(i+1)+"student"+(j+1));
			arr[i][j]=kb.nextBoolean();
		
		
		}
	}
		for(int i=0;i<=arr.length-1;i++)	{
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("The Backlog status of class :"+(i+1)+"student:"+(j+1)+"is :"+arr[i][j]);
			}
		}
	}


}
