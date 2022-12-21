package typeCasting;

public class TypeC2 {

	public static void main(String[] args) {
		int i=12;
		double d1=(double) i;  //explicit widening
		double d2=i;			//implicitly widening
		System.out.println(d1);
		System.out.println(d2);

	}

}
