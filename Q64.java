package cwc30;

import java.util.Scanner;

public class Q64 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the car no: ");
		int n = sc.nextInt();
		int sum = 0;
		if (1000 <= n && n <= 9999) {
		while(n > 0) {
			sum += n%10;
			n /= 10;
		}
		if(sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0) {
			System.out.println("Lucky Number");
		} else {
			System.out.println("Sorry its not my lucky number ");
		}
		}else {
			System.out.println(n + " is not a valid car number");
		}

	}

	}
