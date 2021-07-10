package cwc30;

import java.util.Scanner;

public class Q39 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int count = 0;
		for(int i = a+1 ; i < b ; i++) {
			if(i == 0 || i == 1) {
				continue;
			}
			count = 1;
			for(int j = 2 ; j <= i/2 ; j++) {
				if(i%j == 0) {
					count = 0;
					break;
				}
			} if(count == 1) {
				System.out.println(i);
			} 
		} n--;
	 }

	}

}
