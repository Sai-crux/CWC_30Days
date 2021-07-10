package cwc30;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if( n <= 0) {
			System.out.println(0);
		} else {
			int[] fib = new int[n+1];
			fib[0] = 0;
			fib[1] = 1;
			int sum = fib[0] + fib[1];
			for(int i = 2 ; i <= n ; i++) {
				fib[i] = fib[i-1] + fib[i-2];
				sum += fib[i];
			}
			System.out.println("The partial sum of the fibonacci is: " + sum);
			
		}
	}

}
