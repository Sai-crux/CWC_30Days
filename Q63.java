package cwc30;

import java.util.Scanner;

public class Q63 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double n = sc.nextInt();
		if(n > 250) {
			double a = n - 250;
			int s = (int) a / 200;
			double t = s * 2.50;
			System.out.println("P" + (40+t));
		} else if (n <= 250) {
			System.out.println("P" + 40);
		}

	}

}
