 
 
 class Calcam{
    
public static void main(String args[]){

 double a =Double.parseDouble(args[0]); 
 double b =Double.parseDouble(args[2]);
 double c =0;
   
  String operator =args[1];
switch((operator)){
case "+":
            c =a+b;
            break;
 case "-":
            c = a-b;
            break;
 case "*":

           c = a*b;
            break;   
 case "/":

            c = a/b;

           break;                    

default:

}
System.out.println("result is :"+c);
}

}
    

