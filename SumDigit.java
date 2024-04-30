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
public class SumDigit {
    public static void main(String args[]){
    Scanner kb=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=kb.nextInt();
    int sum=0;
    while(num>0){
        int temp=num%10;
        sum= sum+temp;
        num=num/10;
        
        
    }
    System.out.println("sum of digit :"+sum);
    
    }
}
