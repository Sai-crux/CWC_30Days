package cwc30;

import java.util.Scanner;

public class Q82 {
	 static int check(int[] arr, int n) {
		 int a = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[1] != arr[i]) {
				a = i;
				break;
			} 
		} if(a != 0) {
			return a;
		} return -1;
			
		}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(check(arr, n));
		
			
		
		
		

	}

}
