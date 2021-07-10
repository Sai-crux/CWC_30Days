package cwc30;

import java.util.Scanner;

public class Q23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		int[] arr2 = new int[n];
		
		System.out.print("Enter the elements of first array: ");
		
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter the elements of second array: ");
		
		for(int i = 0 ; i < n ; i++) {
			arr2[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < n ; i++) {
			System.out.print(arr[i] + " " + arr2[i] + " ");
		}
		
	}

}
