package oops;

public class MethodOverLoading {
	int a;
	int b;
	
	void sum()   // First method
	{
		a=10;
		b=20;
		System.out.println(a+b);
	}
	
	void sum(int x,int y)       //Second Method
	{
		a=x;
		b=y;
		System.out.println(x+y);
	}
	
	void sum(int x,int y,int z)    //Third type
	{
		System.out.println(x+y+z);
	}
	
	void sum(int x,double y)         //Fourth method
	{
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
		MethodOverLoading mo=new MethodOverLoading();
		mo.sum();
		mo.sum(100,20);
		mo.sum(1002,20,40);
		mo.sum(10,100.552);
	}

}
