package ArrayExample;

import java.util.Scanner;

public class program12 {
	public static void main(String[] args) {
		int []arr=new int[10];
		Scanner kb=new Scanner(System.in);
		for(int i=0;i<=9;i++) {
			System.out.println("Enter number is ");
			arr[i]=kb.nextInt();
			
			
		}
		for(int i =0;i<=9;i++) {
			System.out.println("Number is that: ="+i);
		}
		
	}

}
