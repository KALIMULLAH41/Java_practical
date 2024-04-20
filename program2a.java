package loopexample;

import java.util.Scanner;

public class program2a {
	public static void main(String args[]) {
		Scanner kb= new Scanner(System.in);
		System.out.println("Enter a number");
		int n=kb.nextInt();
		int f=1;
		while(n>=1) {
			f=f*n;
			n--;
		}
		System.out.println("Factorial is "+f);
		
	}
	

}
