package cwc30;

import java.util.Scanner;

public class Q1 {
	
	static int outcome(int n) {
		if (n == 1) {
			return 0;
		}
		if(n == 2) {
			return 1;
		}
		else {
			return (n-1)*(outcome(n-1) + outcome(n-2));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(outcome(n));

	}

}
