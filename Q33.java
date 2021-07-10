package cwc30;

import java.util.Arrays;
import java.util.Scanner;

public class Q33 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		while(m>0) {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		for(int e: arr) {
			System.out.print(e + " ");
		}
		m--;
		}

	}

}
