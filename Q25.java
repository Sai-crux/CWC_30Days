package cwc30;

import java.util.Scanner;

public class Q25 {
	
	static int toggle(int a , int b) {
		return (a ^ (1 << (b-1)));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		System.out.println("Enter the bit you want to toggle: ");
		int m = sc.nextInt();
		System.out.println(toggle(n, m));

	}

}
