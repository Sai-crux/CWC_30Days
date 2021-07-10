package cwc30;

import java.util.Scanner;

class Ref{
	
	 double Add(double a, double b){
		double c = a + b;
		return c;
	}
}

public class Q55 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the real part of 1st complex number: ");
		double x1 = sc.nextDouble();
		System.out.print("Enter the imaginary part of 1st complex number: ");
		double y1 = sc.nextDouble();
		System.out.print("Enter the real part of 2nd complex number: ");
		double x2 = sc.nextDouble();
		System.out.print("Enter the imaginary part of 2nd complex number: ");
		double y2 = sc.nextDouble();
		
	Ref aa = new Ref();
	System.out.print("The sum of the two complwx numbers is: " + aa.Add(x1, x2) + " + " + aa.Add(y1, y2) + "i");
	
	}
}
