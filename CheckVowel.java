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
public class CheckVowel {
    
    
    
    public static void main(String args[]){
    Scanner kb =new Scanner(System.in);
    System.out.println("Entre a character");
    char ch=kb.nextLine().charAt(0);
    char lowercaseChar=Character.toLowerCase(ch);
    if(isVowel(lowercaseChar)){
        System.out.println(""+ch+" is a vowel :");  
    }
    else{
        System.out.println(""+ch +"is not a vowel.");
    }
    }


    public static boolean isVowel(char ch1){
    return ch1 =='o'||ch1=='e'||ch1=='i'||ch1=='a'||ch1=='u';
    }
    
    }