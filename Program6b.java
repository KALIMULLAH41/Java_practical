package loopexample;

import java.util.Scanner;

public class Program6b {
public static void main(String args[]) {
	Scanner kb =new Scanner(System.in);
	System.out.println("Enter a  alphabate ");
	char ch=kb.next().charAt(0);
	switch(ch) {
	case 'a':
	case 'e':
	case 'i':
	case  'o':
	case 'u':
		System.out.println("It is a vowel");
		break;
		default :System.out.println("It is a not Vowel");
	}
	
	      
}
}
