package cwc30;

import java.math.BigInteger;

public class Q95 {

	public static void main(String[] args) {
		   BigInteger res = new BigInteger("2");
		    boolean isPrime = true;
		    for (int i = 3 ; i < 2000000 ; i++) {
		        for (int j = 2 ; j <= Math.sqrt((double)i) ; j++){
		            if (i % j == 0){ 
		                isPrime = false;
		                break;
		            }
		        }
		        if(isPrime){
		            res = res.add(BigInteger.valueOf(i));
		        }
		        isPrime = true;
		    }
		    System.out.println(res); 
		}
	}


