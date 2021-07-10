package cwc30;

import java.util.ArrayList;
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
//		Calculate the area of a Circle inscribed in a Square.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of the square: ");
		double a = sc.nextDouble();
		System.out.println("Thus the radius of the circle inscribed in it is: " + a/2.0);
		System.out.println("The area of the circle is: " + Math.PI * Math.pow((a/2.0),2));
		
		

	}

}
