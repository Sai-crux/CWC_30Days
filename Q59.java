package cwc30;

import java.util.Scanner;

public class Q59 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		int q = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array: ");
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0 ; i < p ; i++) {
			int last = arr[n-1];
			for(int j = n-1; j > 0 ; j--) {
				arr[j] = arr[j-1];
			}
			arr[0] = last;
		}
		System.out.println("The elements are: ");
		for(int i = 0 ; i < q ; i++) {
			System.out.println(arr[i]);
		}

	}

}
