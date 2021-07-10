package cwc30;

import java.util.Scanner;

public class Q80 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int	ncou2 = 0;
		if( n < 7) {
		 ncou2 = 1;
		} 
		int ncou1 = 0;
		while(n > 0) {
			if(n%2 == 1) {
				ncou1++;
				
			} else if(n % 2 == 0) {
				ncou2++;
				
			}
			n /= 2;
		}
		int m = sc.nextInt();
		int mcou1 = 0;
		int mcou2 = 0;
		if( m < 7) {
			 mcou2 = 1;
			} 
		while(m > 0) {
			if(m%2 == 1) {
				mcou1++;
				
			} else if(m % 2 == 0) {
				mcou2++;
				
			}
			m /= 2;
		}
		if(ncou1 == mcou1 && ncou2 == mcou2) {
			System.out.println("True");
		}
		
		

	}

}
