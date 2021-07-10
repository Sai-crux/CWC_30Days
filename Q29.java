package cwc30;

import java.util.Scanner;

public class Q29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		double lastDig = 0;
		double sum = 0;
		double sumFin = 0;
		System.out.print("The series: ");
		for(int i = 1 ; i <= n ; i++) {
			lastDig = 5 / Math.pow(10, i);
			sum += lastDig;
			System.out.print(sum + " ");
			sumFin += sum;
		}System.out.println();
		System.out.println("Sum of the series is: " + sumFin);

	}

}
