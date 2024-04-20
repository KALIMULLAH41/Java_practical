package ArrayExample;

public class oneDarrayusingDowhile {
	public static void main(String[] args) {
		int []arr= {70,36,28,23,42};
		int i=0;
		do {
			System.out.println("Element at index  : "+arr[i]);
			i++;
		}while(i<arr.length);
	}

}
