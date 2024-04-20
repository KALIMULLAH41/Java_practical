package ArrayExample;

import java.util.Scanner;

// ctrl + shift + o
public class Program5 {
	public static void main(String[] args) {
		float []arr=new float[7];

		Scanner sc = new Scanner(System.in);

		for(int i =1;i<=6;i++) {
			System.out.println("The percentage of student are:"+(i+1));
			arr[i]=sc.nextFloat();

		}
		System.out.println("The percentage of student are:");
		for(int i =1;i<=6;i++) {
			System.out.println(arr[i]);


		}
		sc.close();
	}
}
