package strings;

public class AddNumberAndString {

	public static void main(String[] args) {
		// If you add two numbers, the result will be a number:
		int i=10;
		int x=20;
		int z=i+x;
		System.out.println(z);
		
	//If add two string ,the result will be string
		String a="10";
		String b="20";
		String z1=a+b;
		System.out.println(z1);
		
	//If add a int and string, result will be String
		String z2=a+i;
//		int z2=a+i; //error type mismatch
		System.out.println(z2);

	}

}
