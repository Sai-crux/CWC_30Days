package cwc30;

import java.util.Scanner;

public class Q61 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		double n = sc.nextDouble();
		double x = n;
		double root = 0;
		while(true) {
			root = 0.5*(x + (n/x));
			if(Math.abs(root - x) < 0.00001)
				break;
			x = root;
		}
		System.out.println("The root of the number found through newton's method is: " + root);

	}

}
