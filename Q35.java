package cwc30;

import java.util.Scanner;

public class Q35 {

	public static void main(String[] args) {
		//Fn = {[(5 + 1)/2] ^ n} / 5 
//		an = [Phin – (phi)n] / Sqrt[5].
//				Phi = (1 + Sqrt[5]) / 2
//						phi = (1 – Sqrt[5]) / 2
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double Phi = (1 + Math.sqrt(5.0))/2;
		double phi = (1 - Math.sqrt(5.0))/2;
		double a = Math.round((Math.pow(Phi, n-1) - Math.pow(phi, n-1)) / Math.sqrt(5.0));
		
		System.out.println("The " + n + "th fibonacci number is: " + a);

	}

}
