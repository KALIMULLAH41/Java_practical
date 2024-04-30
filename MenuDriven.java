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
public class MenuDriven {
    public static void main(String args[]){
    
    Scanner kb = new Scanner(System.in);
    System.out .println("Enter your  option");
    System.out.println("1 for factorial :");
    System.out.println("2 Prime :");
    System.out.println("3 Even/odd :");
    System.out.println("4 Quit :");
    int choice=kb.nextInt();
    switch(choice){
        case 1:
            Scanner kb1=new Scanner(System.in);            
            System.out.println("Enter a number :");
            int num1=kb.nextInt();
           int fact=1;
           for(int i=1;i<=num1;i++){
               fact= fact*i;
           }
           System.out.println("Factorial "+fact);
           break;
        case 2:
            Scanner kb2=new Scanner(System.in);
            System.out.println("Enter a number :");
            int num2=kb2.nextInt();
            int count=0;
            for(int i =1;i<=num2;i++){
                if(num2%2==0){
                    count++;
                }
                
            }
            if(count ==2){
                System.out.println("Prime number ");
                break;
            }
            else {
                System.out.println("Not Prime number ");
                break;
            }
           
        case 3 :
            Scanner kb3=new Scanner(System.in);
            System.out.println("Enter a number :");
            int num3=kb3.nextInt();
            if(num3%2==0){
                System.out.println("Even number ");
                break;
            }
            else {
                System.out.println("Odd number ");
                break;
            }
            case 4:
                System.out.println("Quit");
                break;
    }
    
    }
    
}
