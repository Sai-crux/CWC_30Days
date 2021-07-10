package cwc30;

import java.util.Scanner;

public class Q66 {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		int n = 15;
		int[] arr = new int[n];
		int[] arr2 = new int[n];
		int last = n/2*7 ;
		for(int i = 0 ; i < n/2 ; i++) {
				arr[i] = i * 7;
			}
		
		for(int i = 0 ; i < n/2 ; i++) {
			arr2[i] = i * 6;
		}
		if((n&1) == 0) {
		for(int i = 0 ; i < n/2 ; i++) {
			System.out.print(arr[i] + " " + arr2[i] + " ");
		}
		} else {
			for(int i = 0 ; i < n/2 ; i++) {
				System.out.print(arr[i] + " " + arr2[i] + " ");
				
			}System.out.println(last);
		}
		
		System.out.println("The 15th term is: " + last);

	}

}
	
