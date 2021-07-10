package cwc30;

import java.util.Scanner;

public class Q56 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int sum1 = 0;
		int last = 0;
		int last1 = 0;
		while(n > 0) {
			last = n%10;
			sum += last;
			n /= 10;
			
		}
		while(sum > 0) {
			last1 = sum%10;
			sum1 += last1;
			sum /= 10;
		}
		if(sum1 == 1) {
			System.out.println("Magic Number");
		} else {
			System.out.println("Not Magic Number");
		}

	}

}
