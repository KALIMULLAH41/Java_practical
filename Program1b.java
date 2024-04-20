package loopexample;



public class Program1b {
	public static void main(String args[]) throws Exception
	{
		
		char gender;
		System.out.println("Enter a gender");
		gender=(char)System.in.read();
		
		if(gender=='M') {
		System.out.println("your gender is male");
		}
		
		else if(gender=='F'){
			System.out.println("your gender is female");
					
		}
		else 
		{
			System.out.println("Wrong input");
		}
	}

}
