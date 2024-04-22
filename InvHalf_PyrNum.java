package pattern;

public class InvHalf_PyrNum {
	public static  void inHal_PaNum(int n) {
		for(int i=1;i<=n;i++) {
			//inner- number
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		inHal_PaNum(5);
	}

}
