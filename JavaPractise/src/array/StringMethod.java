package array;

public class StringMethod {

	public static void main(String[] args) {
		//Length of the string
		String s= "welcome";
		System.out.println(s.length());
		
		//concatenation
		String s1="Welcome to";
		String s2="Dubai";
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2);
		System.out.println("welcome"+"to Dubai");
		System.out.println("Welcome to".concat("Dubai"));
	
		//Equals
		String s3="WELCOME";
		String s4="welcome";
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		
		//contains()
		System.out.println(s3.contains("WEL"));
		System.out.println(s3.contains("wel"));
		
		//substring()
		System.out.println(s.substring(0,3));               //--->WEL
		System.out.println(s.substring(2,5)); 
		
		
	//Replace
		System.out.println(s.replace('e','a'));
		System.out.println(s.replace("wel", "tal"));
	}

}
