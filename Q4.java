package cwc30;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter coordinate points for point a: ");
		double a1 = sc.nextDouble();
		double a2 = sc.nextDouble();
		System.out.println("Enter coordinate points for point b: ");
		double b1 = sc.nextDouble();
		double b2 = sc.nextDouble();
		System.out.println("Enter coordinate points for point c:");
		double c1 = sc.nextDouble();
		double c2 = sc.nextDouble();
		System.out.println("Enter coordinate points for point d: ");
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		
		double e1 = Math.pow((Math.pow((a1-c1),2)+Math.pow((a2-c2), 2)), 0.5);
		double e2 = Math.pow((Math.pow((b1-d1),2)+Math.pow((b2-d2), 2)), 0.5);
		
		if(e1 == e2) {
			System.out.println("Given coordinates are of a rectangle");
		} else
			System.out.println("Given coordinates are not of a rectangle");

	}

}
