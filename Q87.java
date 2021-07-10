package cwc30;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q87 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a float number: ");
		float a = sc.nextFloat();
		System.out.printf("The rounded value of " + a + " is: " +Math.round(a));

	}

}
