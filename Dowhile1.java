package twoarray;

public class Dowhile1 {
	public static void main(String[] args) {
		int [][]arr= {{12,15,16},{18,19,50}};
		int i=0,j=0;
		do {
			System.out.print(arr[i][j]+" ");
			j++;
			
		System.out.println();	
		}
		
		while(i<arr.length);
		
	}

}
