import java.util.Scanner;
class Prime{
public static void main(String[] args) {
       Scanner kb=new Scanner(System.in);
        System.out.println("enter a number");
        int a = kb.nextInt();
        int i=2;
        
            if(a%i==0){
                System.out.println("not prime");
        }
        else if(a/i!=0){
            System.out.println("Number is  prime");
        }
       
        }
}
