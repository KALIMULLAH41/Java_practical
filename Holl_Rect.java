package pattern;

public class Holl_Rect {
	public static void main(String[] args) {
		int totRow=4;
		int totCols=4;
	
	for(int i=1;i<=totRow;i++) {
		//inner col
		for(int j=1;j<=totCols;j++) {
			//cell-(i,j)
			if(i==1||i==totRow||j==1||j==totCols) {
				//boundary cell
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	}
}
