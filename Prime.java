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
public class Prime {
    public static void main(String args[]){
    Scanner kb=new Scanner(System.in);
    System.out.println("Enter a number :");
    int num=kb.nextInt();
    int count=0;
    for(int i=1;i<=num;i++){
        if(num%i==0){
        count++;
        }
        
    }
    if(count ==2){
        System.out.println("Prime number :");
    }
    else{
    System.out.println("Not prime number :");
    }
    }
}
