package array;

public class TwoDimensionArray {

	public static void main(String[] args) {
		int a[][]= {{10,20,30}, {30,10,40}, {50,90,100}};
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
