package cwc30;

import java.util.Scanner;

public class Q76 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of cuts: ");
		int n = sc.nextInt();
		
		int max = ((n*n)+n+2)/2;
		System.out.println("The maximum number of pieces are: " + max);

	}

}
