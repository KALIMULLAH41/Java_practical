package loopexample;

import java.util.Scanner;

public class Program12c {
public static void main(String args[]) {
	Scanner kb= new Scanner(System.in); 
	System.out.println("Enter the value of n");
	int n =kb.nextInt();
	for(int i=1;i<=n;i++) {
		if(i%2==0) {
			System.out.println(i);
		}
		
	}
	
}
}
