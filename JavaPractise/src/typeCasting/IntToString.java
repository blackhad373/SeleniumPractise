package typeCasting;

public class IntToString {

	public static void main(String[] args) {
		// Converting into to string
		String s=" "+123;
		System.out.println(s+1);
		
		int i=123;
		String str="ABC"+i;
		System.out.println(str);

		boolean i1=true;
		String s1=" "+'a';
		String s2="ABC"+i1;
		System.out.println(s1);
		System.out.print(s2);
	}

}
