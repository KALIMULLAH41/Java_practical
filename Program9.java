package ArrayExample;

import java.util.Scanner;

public class Program9 {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter of employee ");
		int n = kb.nextInt();
		String []arr=new String[n];
		kb.nextLine();
		for(int i=0;i<=n-i;i++) {
			System.out.println("Enter name of employee:"+(i+1));
			arr[i]=kb.nextLine();
			
		}
		for(int i=0;i<=n-1;i++) {
			System.out.println("The name of employee :"+(i+1)+"is:"+arr[i]);
		}
	}

}
