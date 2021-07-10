package cwc30;

import java.math.BigInteger;

public class Q9 {

	public static void main(String[] args) {
		BigInteger sum = BigInteger.valueOf(0);
		BigInteger pro = BigInteger.valueOf(1);
		
		for(long i = 1 ; i <= 100 ; i++) {
			pro = pro.multiply(BigInteger.valueOf(i));
		}
			
		while(!pro.equals(BigInteger.ZERO)) {
			sum = sum.add(pro.mod(BigInteger.valueOf(10)));
			pro = pro.divide(BigInteger.valueOf(10));
		}
		System.out.println(sum);

	}

}
