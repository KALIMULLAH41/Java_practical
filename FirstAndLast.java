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
public class FirstAndLast {
     public static void main(String args[]){
    Scanner kb = new Scanner(System.in);
    System.out.println("Enter a number :");
 int num=kb.nextInt();
 int f=0,l;
 l=num%10;
 while(num!=0){
     
 f=num%10;
 num=num/10;
 
    
}
 System.out.println("First digit = "+f+"and last digit ="+l);
         
    }
    
}
