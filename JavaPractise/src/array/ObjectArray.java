package array;

public class ObjectArray {

	public static void main(String[] args) {
		Object a[]=new Object[5];
		a[0]=10;
		a[1]=12.556;
		a[2]="welcome";
		a[3]='F';
		a[4]=true;
		for(Object i:a) {
			System.out.println(i);
		}

	}

}
