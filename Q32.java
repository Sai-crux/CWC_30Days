package cwc30;

import java.util.Scanner;



public class Q32 {
		static int fact(int k) {
			if (k == 0) {    
		    return 1;    
			}
		  else    
		    return(k * fact(k-1));   
		}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a = fact(n);
		int b = fact(m);
		int c = fact(n-m);
		int d = a/(b*c);
		System.out.println(d);
		
		

	}

}
