package loopexample;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	Scanner kb=new Scanner(System.in);
	System.out.println("Enter a age:");
	int age =kb.nextInt();
	if(age>18) {
		System.out.println("you are eligible to vote");
		
		
	}
	else
		System.out.println("you are not eligible to vote");
	

	}

}
