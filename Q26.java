package cwc30;

import java.util.Scanner;

public class Q26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = (int)Math.pow(n, 0.5);
		if(a * (a+1) == n) {
			System.out.println(n + " is a pronic number.");
		} else {
			System.out.println(n + " is not a pronic number.");
		}

	}

}
