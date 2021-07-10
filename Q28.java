package cwc30;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q28 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		int a = n;
		int[] arr = new int[n];
		int[] rev = new int[n];
		int sum = 0;
		for(int i = 0 ; i < n ; i++) {
			arr[i] = i+1;
		}
		for(int i = 0; i < n ; i++) {
			rev[a-1] = arr[i];
			a = a-1;
		}
		for(int i = 0 ; i < n ; i++) {
			sum += Math.pow(arr[i], rev[i]);
		}
		System.out.println(sum);
		
	}

}
