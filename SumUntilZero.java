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
public class SumUntilZero {
    public static void main(String args[]){
    Scanner kb =new Scanner(System.in);
    int sum=0;
    int number;
    System.out.println("Enter integer (enter 0 to calculate sum)");
    

    while(true){
        number=kb.nextInt();
        if(number==0){
        break;
        
        }
        sum=sum+number;
        }
    System.out.println("sum of numbers entered before   :"+sum);
    }
    
}
