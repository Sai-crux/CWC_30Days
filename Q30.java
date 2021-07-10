package cwc30;

import java.util.ArrayList;
import java.util.Scanner;

public class Q30 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		ArrayList<Integer> pos = new ArrayList<Integer>();
		ArrayList<Integer> neg = new ArrayList<Integer>();
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0 ; i < n ; i++) {
			if(arr[i] > 0) {
				pos.add(arr[i]);
			} else if (arr[i] <= 0) {
				neg.add(arr[i]);
			}
		}
		pos.addAll(neg);
		System.out.println("The rearranged array is: ");
		Object[] fin = new Object[n];
		fin = pos.toArray();
		for(Object e: fin) {
			System.out.print(e + " ");
		}
	}

}
