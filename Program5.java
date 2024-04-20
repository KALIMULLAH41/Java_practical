package loopexample;

import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter a number");
		int num =kb.nextInt();
		switch(num) {
		case 1:System.out.println("one");
		break;
		case 2:System.out.println("Two");
		break;
		case 3:System.out.println("Three");
		break;
		case 4:System.out.println("Four");
		break;
		case 5:System.out.println("five");
	    break;
	    default:System.out.println("invalid number");
		}
	}

}
