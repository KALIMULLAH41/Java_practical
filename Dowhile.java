package twoarray;

public class Dowhile {
	public static void main(String[] args) {
		int [][]arr= {{12,15,16},{18,19,50}};
		
	int i=0,j=0;
		while(i<arr.length) {
			j=0;
			
		
		while(j<arr[i].length) {
			System.out.print(arr[i][j]+" ");
			j++;
		}
		System.out.println();
		i++;
	}

	}
}
