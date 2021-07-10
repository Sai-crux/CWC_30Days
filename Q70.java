package cwc30;

import java.util.Scanner;

public class Q70 {
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		for(int i = 2 ; i * i <= n ; i++) {
			while(n % i == 0) {
				sum += i;
				n /= i;
				System.out.println(sum + "i");
				System.out.println(n + "f");
			}
		}
		sum = sum + n;
		System.out.println("The minimum sum of the factors of " + temp + " is: " + sum);
       
		
	}

}
