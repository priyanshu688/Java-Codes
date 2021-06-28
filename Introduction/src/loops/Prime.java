package loops;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		boolean isPrime = true;
		
		for(int i = 2; i < n;i++) {
			
			if(i % 2 ==0) {
				isPrime = false;
				break;
			}
		}

		System.out.println("isPrime" + isPrime);
	}

}
