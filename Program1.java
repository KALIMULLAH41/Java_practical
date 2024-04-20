package twoarray;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter the number of companies ");
		 int  comp =kb.nextInt();//rows
		  System.out.println("Enter the number of empolyees in each company ");
		   int emp =kb.nextInt();//cols
	       	String[][]arr=new String[comp][emp];
		for(int i=0;i<=arr.length-1;i++) {
		  for(int j=0;j<=arr[i].length-1;j++) {
			System.out.println("Enter the name of company:"+(i+1)+"employee"+(j+1));
			arr[i][j]=kb.next();
		
		
		}
	}
		for(int i=0;i<=arr.length-1;i++)	{
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("The name of company :"+(i+1)+"employee:"+(j+1)+"is :"+arr[i][j]);
			}
		}
	}

}
