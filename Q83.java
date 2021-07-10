package cwc30;

import java.util.Scanner;

public class Q83 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements: ");
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		int max = 0;
		System.out.println("The leader elements are: ");
		System.out.print(arr[n-1] + " ");
		for(int i = n-1; i >= 1 ; i--) {
			max += arr[i];
			if(arr[i-1] > max) {
				System.out.print(arr[i-1] + " ");
			}
		}

	}

}
