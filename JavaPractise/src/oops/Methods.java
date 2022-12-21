package oops;

public class Methods {
	 
	int a;
	int b;
	
	//method takes no parameters
/*	void sum()
	{
		System.out.println(a+b);
	}
*/	
	
/*	//method takes parameter
	void sum(int x,int y)
	{
		 System.out.println(x+y);
	}
*/	
	
	//method return some values
	int sum()
	{
		return(a+b);
	}
	
	
	public static void main(String[] args) {
		Methods met=new Methods();
	//1 & 4 -->method may not takes parameters- empty parameters
	/*  met.a=100;
		met.b=200;
		met.sum();
	*/
	
/*		//2.method takes parameters
          met.sum(200,300);
*/	

		//3.methods returns some value
		met.a=100;
		met.b=400;
		int r=met.sum();
		System.out.println(r);
	
	
	}

}
