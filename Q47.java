package cwc30;

import java.util.Scanner;

public class Q47 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		int digits = 0;
		while(temp > 0) {
			temp /= 10;
			digits++;
		}
		temp = n;
		while(temp > 0) {
			sum += (int)(Math.pow((temp%10), digits));
			temp /= 10;
		}
		if(n == sum) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not armstrong");
		}
		

	}

}
