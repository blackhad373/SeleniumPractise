package inheritance;

class A
{
	static int a=10;
	int b;
	
	void display()
	{
		System.out.println(a+b);
	}
}
class B extends A
{
	int a;
	
	static void show()
	{
		System.out.println(a);
}
}
class C extends B
{
	int d;
	
	void showing()
	{
		System.out.println(a+d);
	}
}
public class Multilevel {

	public static void main(String[] args) {
		C obj=new C();
		obj.a=20;
		obj.b=20;
		obj.display();
		obj.showing();
		
	
	}

}
