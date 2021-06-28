package userInput;
import java.util.Scanner;

public class ScannerUserInput {

	public static void main(String[] args) {
		
		int principal = 5000;
		float rate = 12.5f;
		int time = 12;
		
		float simpleInterest = principal * rate * time / 100;
		
		System.out.println(" the simple interest is " + simpleInterest);
	}

}
