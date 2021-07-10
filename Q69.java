package cwc30;

import java.util.Scanner;

public class Q69 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		for(int i = 1 ; i <= a ; i++ ) {
			if(a%i == 0 && (i&1) == 0) {
				sum += i;
				
			}
			
		} System.out.println(sum);

	}

}
