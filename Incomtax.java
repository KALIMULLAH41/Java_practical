package loopexample;

import java.util.Scanner;

public class Incomtax {
	public static void main(String args[]) {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter your income");
		int income =kb.nextInt();
		int tax ;
		if(income<500000) {
			tax =0;
			
		}
		else if(income>50000D&&income<10000) {
			tax=(int)(income*0.2);
			
		}
		else {
			tax=(int)(income*0.3);
			
		}
		System.out.println("Your tax is "+tax);
	}

}
