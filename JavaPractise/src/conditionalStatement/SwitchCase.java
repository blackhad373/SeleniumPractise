package conditionalStatement;

public class SwitchCase {

	public static void main(String[] args) {
		int day=2;
		switch(day)
		{
		case 1: System.out.println("sunday");
		break;
		case 2: System.out.println("monday");
//		break;
		case 3: System.out.println("tuesday");
//		break;
		case 4: System.out.println("wednesday");
//		break;										//As break is not applied so switch block will  not stop the execution until break is applied or block got ended
		case 5: System.out.println("thursday");
		break;
		case 6: System.out.println("friday");
		break;
		default: System.out.println("saturday");
		}
	}

}
