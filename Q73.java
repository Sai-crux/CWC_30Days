package cwc30;

import java.util.Scanner;
import static java.lang.Math.sin;
public class Q73 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float n = sc.nextFloat();
		float acc = 0.0001f;
		float deg = (float) (n * (3.142/180.0));
		float res = deg;
		float sinx = deg;
		float sinFir = (float) sin(deg);
		int a = 1;
		float deno;
		do {
			deno = 2 * a * (2 * a + 1);
			res = -res * deg * deg / deno;
			sinx = sinx + res;
			a = a + 1;
		} while (acc <= sinFir - sinx);
		
		System.out.println(sinx);

	}


}
