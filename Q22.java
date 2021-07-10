package cwc30;

import java.util.Scanner;

public class Q22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		int product = 0;
		
		while(b > 0) {
			if((b&1) != 0 ) {
				product = product + a;
			}
			
			a = a << 1;
			b = b >> 1;
		}
		
		System.out.println("The product of two numbers is: " + product);

	}

}
