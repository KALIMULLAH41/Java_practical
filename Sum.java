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
public class Sum {
    public static void main(String args[]){
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter a count number :");
        
       int  count =kb.nextInt();
       
       int num,sum=0;
               for(int i=0;i<count;i++){
                   num=kb.nextInt();
                   sum=sum+num;
                   
               }
               System.out.println("Sum of all these number :"+sum);
               
       
        
    
    }
    
}
