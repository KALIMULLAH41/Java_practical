package loopexample;

import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter your gender ");
		char gender = kb.next().charAt(0);
		System.out.println("Enter your age");
		int age = kb.nextInt();
		 
if(gender=='M') {
	if(age>=60) {
			System.out.println("Male Senior citizen");
		}

		else {
			System.out.println("Note a male senior citizen");
		}
}
else if(gender=='f') {
			if(age>=55) {
				System.out.println("female seniro citizen");
			}
      			}
			else {
				System.out.println("Note a famle senior citizen");
			}
		}
	}
