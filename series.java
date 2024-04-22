/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kalim
 */
public class series {
    public static void main(String[] args) {
        int n =10,a=0,b=1,c;
        for(int i =2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(b);
        }
        
    }
    
}
