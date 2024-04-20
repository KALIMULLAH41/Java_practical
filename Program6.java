package loopexample;

import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number ");
		int month=kb.nextInt();
		switch(month) {
		case 1:System.out.println("jan");
		break;
		case 2:System.out.println("feb");
		break;
		case 3:System.out.println("march");
		break;
		case 4:System.out.println("april");
		break;
		default:System.out.println("invalid number");
		}
	}

}
