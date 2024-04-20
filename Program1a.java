package loopexample;

import java.util.Scanner;

public class Program1a {
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a gender");
		char gender= kb.next().charAt(0);
		if(gender=='M') {
		System.out.println("your gender is male");
		}
		
		else if(gender=='F'){
			System.out.println("your gender is female");
					
		}
		else 
		{
			System.out.println("Wrong input");
		}
	}

}
