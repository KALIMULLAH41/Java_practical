package loopexample;

import java.util.Scanner;

public class program1 {
public static void main(String[] args) {
	Scanner kb =new Scanner(System.in);
System.out.println("Enter your age ");
int age = kb.nextInt();
if (age >19) {
	System.out.println("you are eligible to vote");
	
}
else 
	System.out.println( "you are eligible to not vote");
}
}
