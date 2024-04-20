package loopexample;

import java.util.Scanner;

public class Example1 {
	public static void main( String args[]) {
		Scanner kb =new Scanner(System.in);
		System.out.println("Enter a first number ");
		int num =kb.nextInt();
		System.out.println("Enter a secod number");
		int num1= kb.nextInt();
		System.out.println("Enter a operator");
		char operater = kb.next().charAt(0);
		switch(operater) {
		case '+':System.out.println(num+num1);
		break;
		case '-':System.out.println(num-num1);
		break;
		case '*':System.out.println(num*num1);
		break;
		case '%':System.out.println(num%num1);
		break;
		//case '/':System.out.println(num/num);
		//break;
		default:System.out.println("invalid input");
		}
				
		
				
	}

}
