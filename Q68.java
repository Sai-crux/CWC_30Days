package cwc30;

import java.util.Scanner;

public class Q68 {
	static void arrprint(int[] arr) {
		for(int e: arr) {
			System.out.print(e+ " ");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the index for split: ");
		int x = sc.nextInt();
		int[] a = new int[x];
		int[] b = new int[n-x];
		for(int i = 0; i < x ; i++) {
			a[i] = arr[i];
		}
		for(int i = 0; i < (n-x) ; i++) {
			b[i] = arr[i+x];
		}
		System.out.println("Resultant array is: ");
		arrprint(b);
		arrprint(a);
		

	}

}
