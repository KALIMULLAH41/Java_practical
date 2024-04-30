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
public class Demo {
    public static void main(String args[]){
        char ch ='Z';
        switch(ch){
            case 'a':
            case 'e':
            case 'i':    
            case 'o':
            case 'u':
                System.out.println(ch +"is vowel");
                break;
            default:
                System.out.println(ch +"is cosonat");
        }
    }
    
    }