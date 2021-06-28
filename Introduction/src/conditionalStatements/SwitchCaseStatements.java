package conditionalStatements;

public class SwitchCaseStatements {

	public static void main(String[] args) {
//
//		int dayOfWeek = 4;
//		
//		switch(dayOfWeek) {
//		
//		case 1:
//			System.out.println("i am on leave");
//			break;
//		case 2:
//			System.out.println(" i am in office");
//			break;
//		case 3:
//			System.out.println(" i am playing football");
//			break;
//		
//			default:
//				System.out.println(" i dont know what day it is");
//			
//		}

		int rating = 1;
		
		switch( rating) {
		 
		case 1:
		case 2:
			System.out.println("bad review");
			break;
		case 3:
			System.out.println("average review");
			break;
		case 4:
		case 5:
			System.out.println("good review");
		}
		
	}

}
