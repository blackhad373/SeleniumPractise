package array;

public class ArrayPractise1 {

	public static void main(String[] args) {
		int a[]=new int[5]; //declaration of array with 5 element
		
		//storing elements into array
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
	// reading element of the array	
//		System.out.println(a[3]); //Printing for a single index
		
		//Printing all the index present in array
/*
		for(int i=0;i<=4;i++)
		{
			System.out.println(a[i]);
		}
	*/
		
		//for...each loop
		for(int i:a)
		{
			System.out.println(i);
		}
	}

}
