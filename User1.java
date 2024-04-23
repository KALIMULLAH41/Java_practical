import java.util.Scanner;
class User1{
public static void main(String args[]){
Scanner kb =new Scanner(System.in);
int n, f=1;
System.out.println("Enter a number");

n=kb.nextInt();
while(n>=1){
f=f*n;
n--;
//System.out.println(n);

}
System.out.println("Factorial is :"+f);


}

}