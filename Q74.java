package cwc30;

import java.util.Scanner;

public class Q74 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of entries you want to make: ");
		int n = sc.nextInt();
		double[] arr = new double[n];
		double sum = 0;
		double reci = 0;
		System.out.println("Enter the numbers: ");
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextDouble();
		}
		for(int i = 0 ; i < n ; i++) {
			reci = 1/arr[i];
			sum += reci;
		}
		System.out.printf("The harmonic mean of the numbers is: " + "%.3f",n/sum);

	}

}
