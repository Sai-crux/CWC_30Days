package cwc30;

import java.util.Scanner;

public class Q81 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sumRi = 0;
		int sumLe = 0;
		int diff = 0;
		int[] arr = new int[n];
		if((n&1) == 0) {
		for(int i = 0; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < (n/2) ; i++) {
			sumLe += arr[i];
		}
		for(int i = (n/2) ; i < n ; i++) {
			sumRi += arr[i];
		}
		
		if(sumLe > sumRi) {
			diff = sumLe - sumRi;
			System.out.println(diff);
		} else {
			diff = sumRi - sumLe;
			System.out.println(diff);
		}
		} else {
			System.out.println("The array has to be even");
		}
	}

}
