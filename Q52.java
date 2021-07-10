package cwc30;

import java.util.Scanner;

public class Q52 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n ; i++) {
			for(int j = i ; j <= (n-1) ; j++) {
				System.out.print(" ");
			}
			System.out.print("C");
			for(int j = 0 ; j <= (i-1) ; j++) {
				System.out.print(" ");
			}
			System.out.print("W");
			for(int j = 0 ; j <= (i-1) ; j++) {
				System.out.print(" ");
			}
			System.out.println("C");
		}

	}

}
