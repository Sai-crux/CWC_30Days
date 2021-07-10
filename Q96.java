package cwc30;

import java.math.BigInteger;

public class Q96 {

	public static void main(String[] args) {
		BigInteger sum = BigInteger.valueOf(0);
		BigInteger begin = BigInteger.valueOf(0);
		for(int i = 1 ; i <= 1000 ; i++) {
			begin = BigInteger.valueOf(i);
			sum = sum.add(begin.pow(i));
		}
		
		String s = sum.toString();
		System.out.println("The last 10 digits are: " + s.substring(s.length()-10));

	}

}
