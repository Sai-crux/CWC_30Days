package cwc30;

import java.util.HashMap;
import java.util.Scanner;

public class Q38 {
	static void subset(int arr[],int a){
			HashMap<Integer, Integer> c = new HashMap<Integer, Integer>();
			int sum = 0;
			for (int i = 0; i < a; i++) {
					sum = (sum + arr[i]) % a;
					if (sum == 0){
						System.out.print(i + 1);
						for (int j = 0; j <= i; j++)
							System.out.print(j + 1 + " ");
						return;
					}
					if (c.containsKey(sum) == true) {
						System.out.println((i -
								c.get(sum)));
						for (int j = c.get(sum) + 1;
								j <= i; j++)
							System.out.print(j + 1 + " ");

						return;
					} else
						c.put(sum,i);
			}
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of test cases: ");
			int d = sc.nextInt();
			while(d > 0) {
				System.out.println("Enter the length of the array: ");
			int n = sc.nextInt();
			int[] arr = new int[n];
			System.out.println("Enter th elements of the array: ");
			for(int i = 0 ; i < n ; i++) {
				arr[i] = sc.nextInt();
			}
			subset(arr, n);
			d--;
			}
		}
	}

	


