package cwc30;

import java.util.ArrayList;
import java.util.Scanner;

public class Q24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		System.out.println("Enter the elements of the array: ");
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0 ; i < n ; i++) {
			if(arr[i] % 2 == 0) {
				even.add(arr[i]);
			} else if (arr[i] % 2 == 1) {
				odd.add(arr[i]);
			}
		}
		even.addAll(odd);
		System.out.println("The rearranged array is: ");
		Object[] fin = new Object[n];
		fin = even.toArray();
		for(Object e: fin) {
			System.out.print(e + " ");
		}

	}

}
