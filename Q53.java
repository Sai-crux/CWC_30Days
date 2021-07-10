package cwc30;

import java.util.Scanner;

public class Q53 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		for(int i = 1 ; i <= n ; i++) {
			System.out.print((int)(Math.pow(i, 2)) + " ");
			System.out.print((int)(Math.pow(i, 3)) + " ");
		}

	}

}
