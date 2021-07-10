package cwc30;

import java.util.Scanner;

public class Q67 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements of array 1: ");
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		System.out.println("Enter the elements of array 1: ");
		for(int i = 0 ; i < n ; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter the number of elements of array 2: ");
		int m = sc.nextInt();
		int[] arr2 = new int[m];
		System.out.println("Enter the elements of array 2: ");
		for(int i = 0 ; i < m ; i++) {
			arr2[i] = sc.nextInt();
		}
		System.out.println("Enter the number of elements of array 1: ");
		int p = sc.nextInt();
		int[] arr3 = new int[p];
		System.out.println("Enter the elements of array 3: ");
		for(int i = 0 ; i < p ; i++) {
			arr3[i] = sc.nextInt();
		}
		int a = 0;
		int b = 0;
		int c = 0;
		
		System.out.println("The common elements are: ");
		while( a < arr1.length && b < arr2.length && c < arr3.length) {
			if(arr1[a] == arr2[b] && arr2[b] == arr3[c]) {
				System.out.print(arr1[a] + " ");
				a++;
				b++;
				c++;
			} else if( arr1[a] < arr2[b]) {
				a++;
			} else if( arr2[b] < arr3[c]) {
				b++;
			} else {
				c++;
			}
		}
		
		

	}

}
