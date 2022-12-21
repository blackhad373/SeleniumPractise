package typeCasting;

public class Narrowing {

	public static void main(String[] args) {
		double d=300.12;
		int i1=(int)d;				//explicit narrowing
	//	int i2=d;                    Implicit narrowing is not possible as it will throw error as type mismatch
		System.out.println(i1);
//		System.out.println(i2);
		
	}

}
