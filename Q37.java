package cwc30;

import java.util.Scanner;

public class Q37 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		boolean check = false;
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0 ; i < n-1 ; i++) {
			int a = arr[i];
			for(int j = i+1 ; j < n ; j++) {
				int b = a^arr[j];
				for(int k = j+1 ; k < n ; k++) {
					int c = b^arr[k];
					for(int l = k+1 ; l < n ; l++) {
						int d = c^arr[l];
						if(d == 0) {
							check = true;
							break;
						}
					} if(check)
						break;
				}if(check)
					break;
			}if(check)
				break;
		}
		if(check) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
