package cwc30;

import java.util.Scanner;

public class Q50 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first Integer: ");
		int n = sc.nextInt();
		System.out.println("Input second Integer: ");
		int m = sc.nextInt();
		int count = 0;
		int couFin = 0;
		for(int i = n+1 ; i < m ; i++) {
			for(int j = 1 ; j < m ; j++) {
				if(i%j == 0) {
					count++;
					
				} 
				}if(count == 2) {
					couFin++;
				}
					count = 0; 
				}
			
			System.out.println(couFin);
		}
		
		

	}


