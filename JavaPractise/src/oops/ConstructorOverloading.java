package oops;

public class ConstructorOverloading {

	int a=0;
	int b=0;
	double c=0;
	
	ConstructorOverloading()
	{
		a=20;
		b=40;
		c=35.5;
	}
	
	ConstructorOverloading(int x, int y)
	{
		a=x;
		b=y;
	}
	
	ConstructorOverloading(int x,int y,double z)
	{
		a=x;
		b=y;
		c=z;
	}
	
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		ConstructorOverloading co=new ConstructorOverloading(); //First constructor
		co.display();
		ConstructorOverloading co1=new ConstructorOverloading(10,20); //second constructor
		co1.display();
		ConstructorOverloading co2=new ConstructorOverloading(10,30,35.5); //third constructor
		co2.display();
	}

}
