package whileLoop;

import java.util.Scanner;

public class PalindroneNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int temp = n;
		int reversedNumber = 0;
		while(temp > 0) {
			int lastDigit = temp % 10;
			reversedNumber = reversedNumber * 10 + lastDigit;
			temp /= 10;
			}
		if(reversedNumber == n) {
			System.out.println(n + " is a palindrone");
		}else {
			System.out.println(n + " is not palindrone");
		}

	}

}
