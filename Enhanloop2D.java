package twoarray;

public class Enhanloop2D {
	public static void main(String[] args) {
		int arr[][]= {{12,15,16},{18,19,50}};
		for(int i[]:arr) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
 