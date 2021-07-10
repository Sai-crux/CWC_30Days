package cwc30;

import java.util.Scanner;

public class Q31 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[4][4];
		for(int i = 0; i < 4 ; i ++) {
			for(int j = 0 ; j < 4 ; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int sum = 0;
		for(int i = 0; i < 4 ; i ++) {
			for(int j = 0 ; j < 4 ; j++) {
				sum += arr[i][j];
			}
		}
		int diff = 0;
		for(int i = 1; i < 3 ; i ++) {
			for(int j = 1 ; j < 3 ; j++) {
				diff += arr[i][j];
			
		}
		}
		System.out.println("Sum = " + ((int)sum-(int)diff));
	}
}

