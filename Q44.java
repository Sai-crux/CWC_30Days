package cwc30;

import java.util.ArrayList;
import java.util.Scanner;

public class Q44 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while(n > 0) {
			if(n % 2 == 0) {
				arr.add(0);
			} else if(n % 2 == 1) {
				arr.add(1);
			}
			n /= 2;
		}
		ArrayList<Integer> rev = new ArrayList<Integer>();
		for(int i = arr.size()-1; i >= 0 ; i--) {
			rev.add(arr.get(i));
		}
		if(arr.equals(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

}
