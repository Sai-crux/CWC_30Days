package cwc30;

import java.util.ArrayList;
import java.util.Scanner;

public class Q65 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int digit = 0;
		int digCoun = 0;
		ArrayList<Integer> numbers = new ArrayList<>();
		while(n>0) {
			digit = n % 10;
			numbers.add(digit);
			n /= 10;
			count++;
		}
		
		Object[] arr = numbers.toArray();
		for(int i = 0 ; i < arr.length-1 ; i++) {
			for(int j = i+1; j < arr.length ; j++){
				if(arr[i] == arr[j]) {
					digCoun++;
				}
			}
		}
		if(digCoun > 0) {
			System.out.println("The number is not unique");
		} else {
			System.out.println("The number is unique");
		}

	}

}
