class Insurance{

public static void main(String args[]){
int age;
String gen ,status;
age = Integer.parseInt(args[0]);
gen =args[1];
status=args[2];
if(status.equalsIgnoreCase("marride")){
  System.out.println("Insurance Given");

}
   else if(gen.equalsIgnoreCase("male")&&age>35){
   System.out.println("Insurance Given");
     }
  else if(gen.equalsIgnoreCase("femal")&&age>30){
   System.out.println("Insurance Given");
      }
else{
    System.out.println("Insurance is not given");
}

}
}