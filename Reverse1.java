/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoopExample;

/**
 *
 * @author kalim
 */
public class Reverse1 {
    public static void main(String args[]){
    int n=987,reverse =0,lastDigit;
    while(n>0){
        lastDigit=n%10;
        reverse=reverse*10+lastDigit;
        n=n/10;
    
    }
    System.out.println(reverse);
    }
}
