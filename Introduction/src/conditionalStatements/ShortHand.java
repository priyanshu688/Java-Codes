package conditionalStatements;

public class ShortHand {

	public static void main(String[] args) {
		
		int a = 15;
		int b = 8;
		
		int maxOfBothNumbers = 0;
		maxOfBothNumbers = a > b ? a : b ;
		
		System.out.println("max of both numbers is" + maxOfBothNumbers);

	}

}