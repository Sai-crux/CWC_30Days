package cwc30;

import java.util.Scanner;

public class Q6 {

	    public static void main (String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number: ");
	        int n = sc.nextInt();
	        System.out.println("Enter the bit to swap: ");
	        int swap1 = sc.nextInt();
	        System.out.println("Enter the bit to swap with: ");
	        int swap2 = sc.nextInt();
	        
	        int p1 = (n >> swap1) & 1;
	        int p2 = (n >> swap2) & 1;
	        
	        int a = (p1 ^ p2);
	        
	        a = (a<< swap1) | (a << swap2);
	        
	        int res = n ^ a;
	        System.out.println(res);
	    }
}
