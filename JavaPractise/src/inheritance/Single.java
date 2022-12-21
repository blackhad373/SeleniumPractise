package inheritance;

class A{

	int a;
	int b;

public void display()
{
	System.out.println(a+b);
	
	}
}
class B extends A
{
	int x;
	int y;
	
	public void show()
	{
		System.out.println(x+y);
	}
}
public class Single {
	public static void main(String[] args) {
		B obj=new B();
		obj.a=200;
		obj.b=300;
		obj.x=250;
		obj.y=360;
		obj.display();
		obj.show();
	}

}
