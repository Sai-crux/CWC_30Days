package cwc30;

import java.util.Scanner;

public class Q77 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want to enter: ");
		int n = sc.nextInt();
		System.out.println("Enter the number to match the difference: ");
		int num = sc.nextInt();
		int count = 0;
		int a = 0;
		int[] arr = new int[n];
		System.out.println("Enter the array elements: ");
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0;  i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				a = arr[i] - arr[j];
				if(a == num) {
					count++;
					
				}
			}
		}
		System.out.println("The number of such pairs are: " + count);

	}

}
