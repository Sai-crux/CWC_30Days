package cwc30;

import java.util.Scanner;

public class Q43 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		System.out.println("The hexadecimal value is " + Integer.toHexString(n) + ", the octal value is " + Integer.toOctalString(n) 
				+ " and the binary value is " + Integer.toBinaryString(n));
		

	}

}
