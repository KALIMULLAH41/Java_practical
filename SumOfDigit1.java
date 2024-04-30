/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoopExample;

import java.util.Scanner;

/**
 *
 * @author kalim
 */
public class SumOfDigit1 {
    public static void main(String args[]){
    Scanner kb = new Scanner(System.in);
    System.out.println("Enter a number :");
 int num=kb.nextInt();
 int first=0,last;
  last=num%10;
  int sum=0;
 while(num!=0){
     
 first=num%10;
 num=num/10;
  
  sum =first+last;
    
}
 System.out.println("Sum is :"+sum);
         
    }
}
