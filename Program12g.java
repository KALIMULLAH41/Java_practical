package loopexample;

import java.util.Scanner;

public class Program12g {
	public static void main(String args[]) {
		Scanner kb =new Scanner(System.in);
		System.out.println("Enter a number");
		int a = kb.nextInt();
		if(a%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("odd");
		}
	}

}
