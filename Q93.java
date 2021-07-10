package cwc30;

import java.math.BigInteger;

public class Q93 {

	public static void main(String[] args) {
		
		int sum = 0;
		String num = BigInteger.valueOf(2).pow(1000).toString();
		
		for(char arr: num.toCharArray()) {
			sum = sum + Character.getNumericValue(arr);
		}
		System.out.println("The sum of the digits of 2^1000 is " + sum);

	}

}
