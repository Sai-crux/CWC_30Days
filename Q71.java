package cwc30;

import java.util.Scanner;

public class Q71 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				System.out.print(((i+j) % 7)+1 + " ");
			}System.out.println();
		}

	}

}
