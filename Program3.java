package loopexample;

import java.util.Scanner;

public class Program3 {
public static void main(String[] args) {
	Scanner kb =new Scanner(System.in);
	System.out.println("Enter the marks ");
	int marks =kb.nextInt();
	if(marks>=80 && marks <=100) {
		System.out.println("Grade -A");
	}
	else if(marks>=60 && marks<80) {
		System.out.println("Grade -B");
	}
	else if(marks>=35 && marks <60) {
		System.out.println("Grade -C");
	}
	else 
	{
		System.out.println("invalid marks");
	}
}
}
