package cwc30;

import java.util.Scanner;

public class Q45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		String s = Integer.toBinaryString(n);
		String a = "" ;
		int cou1 = 0;
		int cou0 = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '1') {
				cou1++;
			} else {
				cou0++;
			}
		}
		for(int i = 0 ; i < cou0 ; i++) {
			a += '0';
		}
		for(int i = 0 ; i < cou1 ; i++) {
			a += '1';
		}
		
		
		int b = Integer.parseInt(a,2); 
		System.out.println("The minimum integer is: " + b);

	}

}
