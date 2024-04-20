package ArrayExample;
import java.util.Scanner;
public class Program4 {

	
		public static void main(String[] args) {
			float []arr=new float[7];
			Scanner kb =new Scanner(System.in);
			for(int i=1;i<=6;i++) {
				
				arr[i]=kb.nextFloat();
				
			}
			for(int i =1;i<=6;i++) {
				System.out.println(i);
			}
		}

	}


