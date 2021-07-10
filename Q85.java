package cwc30;

import java.util.Scanner;

public class Q85 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		while(n > 0) {
			for(int i = n ; i < temp ; i++) {
				System.out.print("  ");
			}
			for(int i = 1 ; i <= n ; i++) {
				System.out.print(i + " ");
			}
			
			System.out.println();
			n--;
		}

	}

}
