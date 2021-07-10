package cwc30;

import java.util.Scanner;

public class Q78 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		System.out.println("Enter the index to swap: ");
		int p = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements: ");
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		int temp = arr[p-1];
		arr[p-1] = arr[n-p];
		arr[n-p] = temp;
		System.out.println("The resultant array is: ");
		for(int e: arr) {
			System.out.print(e + " ");
		}

	}

}
