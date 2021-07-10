package cwc30;

import java.util.Scanner;

public class Q90 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer: ");
		int n = sc.nextInt();
		String num = String.valueOf(n);
		char[] num1 = num.toCharArray();
		System.out.println("The reverse integer is: ");
		for(int i = num1.length-1 ; i >= 0 ; i--) {
			System.out.print(num1[i]);
		}

	}

}
