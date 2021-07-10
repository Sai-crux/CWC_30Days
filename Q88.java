package cwc30;

import java.util.Scanner;

public class Q88 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lower limit of the range: ");
		int min = sc.nextInt();
		System.out.println("Enter the upper limit of the range: ");
		int max = sc.nextInt();
	        
	     System.out.println("The random integer between " + min + " and " + max + " is: ");
	     int ranInt = (int)Math.floor(Math.random()*(max-min+1)+min);
	     System.out.println(ranInt);

	}

}
