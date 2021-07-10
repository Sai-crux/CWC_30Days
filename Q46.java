package cwc30;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Q46 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the coefficient of x^2: ");
		double a = sc.nextDouble();
		System.out.print("Enter the coefficient of x: ");
		double b = sc.nextDouble();
		System.out.print("Enter the constant: ");
		double c = sc.nextDouble();
		
		double d = -b/(2*a);
		double e = 4 * a * c;
		double f = Math.pow(b, 2) - e;
		NumberFormat nf= NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
 
		
		if(f < 0) {
			double g = Math.pow(-f, 0.5) / (2 * a);
			System.out.println("root 1 = " + d + " + " + nf.format(g) + "i");
			System.out.println("root 2 = "+ d + " - " + nf.format(g) + "i");
		} else {
			double g = Math.pow(f, 0.5) / (2 * a);
			System.out.println("root 1 = " + d + " + " + nf.format(g) + "i");
			System.out.println("root 2 = "+ d + " - " + nf.format(g) + "i");
		}
		
		
		
		
		

	}

}
