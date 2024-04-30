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
public class ArmStrong {
    public static void main(String args[]){
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n,arm=0,rem,temp;
        n=kb.nextInt();
        temp=n;
        while(n>0){
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }
        if(temp==arm){
            System.out.println("Armstrong Number");
        
        }
        else{
            System.out.println("Not Armstrong Number");
        }
    }
    
}
