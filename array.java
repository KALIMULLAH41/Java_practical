
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kalim
 */
public class array {
    public static void main(String[] args) {
	float []arr=new float[7];
	Scanner scan = new Scanner(System.in);
	for(int i =1;i<=6;i++) {
		System.out.println("The percentage of student are:"+(i+1));
		arr[i]=scan.nextFloat();
		
	}
	System.out.println("The percentage of student are:");
	for(int i =1;i<=6;i++) {
		System.out.println(arr[i]);
		
		
	}
}
}
