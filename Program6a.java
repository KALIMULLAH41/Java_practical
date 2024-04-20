package loopexample;

import java.util.Scanner;

public class Program6a {
	public static void main(String args[]) {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = kb.nextInt();
		switch(num) {
		case 1:
		case 2:
		case 3:
		case 4:
			System.out .println("winter season");
		break;
		case 5:
		case 6:
		case 7:
		case 8:
			System.out.println("Summer season");
			break;
		case 9:
		case 10:
		case 11:
		case 12:
			System.out.println("Rainy season");
			break;
			default:
				System.out.println("invalid in put");
		}
	}

}
