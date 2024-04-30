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
public class Table {
    public static void main(String args[]){
    
    Scanner kb =new Scanner(System.in);
    System.out.println("Enter a number :");
    int num=kb.nextInt();
    for(int i=1;i<=10;i++){
        System.out.println(num+"*"+i+"="+num*i);
    }
    
    }
    
}
