package cwc30;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n <= 10) {
			for(int i = 1 ; i <= n ; i++) {
				System.out.print(i + " ");
			}
		} else {
			for(int i = 1 ; i <= 10 ; i++) {
				System.out.print(i + " ");
			}
			int a = 10;
			for(int i = 11 ; i <= n ; i++) {
				int b = a+2;
				int c = b+9;
				if(i%2 == 1) {
					System.out.print(b + " ");
				} else {
					System.out.print(c + " ");
					a = c;
				}
				
			}
		}

	}

}
