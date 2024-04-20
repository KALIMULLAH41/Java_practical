package twoarray;

import java.util.Scanner;

public class Program1a {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter The nuber of school ");
		int school=kb.nextInt();
		System.out.println("Enter The class ");
		int classes=kb.nextInt();
		System.out.println("Enter The student");
		int student=kb.nextInt();
		Boolean arr[][][]=new Boolean[school][classes][student];
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				for(int k=0;k<=arr[i][j].length-1;k++) {
				System.out.println("Enter The data"+(i+1)+"number of class "+(j+1) +"number of student  :"+(k+1));
				arr[i][j][k]=kb.nextBoolean();
				}	
			}
		}
			for(int i=0;i<=arr.length-1;i++) {
				for(int j=0;j<=arr[i].length-1;j++) {
					for(int k=0;k<=arr[i][j].length-1;k++) {
					System.out.println("Nuber of school  " +(i+1)+" number of class "+(j+1) +"number of student  : "+(k+1));
				}
		} 
		           
				
		
			}
		
		
	}
	

}
