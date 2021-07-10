package cwc30;

import java.util.Arrays;
import java.util.Scanner;

public class Q54 {
		static boolean digit(int num) {
	        return (num >= 0 && num < 10);
	    }
	    static boolean Pal(int num, int n) {
	        if (digit(num))
	            return (num == (n) % 10);
	        if (!Pal(num/10, n))
	            return false;
	        n /= 10;
	        return (num % 10 == (n) % 10);
	    }
	    static boolean palCheck(int num){
	        if (num < 0)
	           num = -num;
	        int num2 = num; 
	        return Pal(num, num2);
	    }
	    static void palPrime(int n) {
	        boolean prime[] = new boolean[n+1];
	      
	        Arrays.fill(prime, true);
	         
	        for (int p = 2; p*p <= n; p++){
	            if (prime[p]) {
	                for (int i = p*2; i <= n; i += p){
	                    prime[i] = false;}
	            }
	        }
	        for (int p = 2; p <= n; p++){
	           if (prime[p] && palCheck(p)){
	              System.out.print(p + " ");
	              }
	           }
	    }
	    public static void main(String[] args)
	    {
	         Scanner sc = new Scanner(System.in);
	         int n = sc.nextInt();
	         System.out.println("The prime numbers below " + n + " are: ");
	        palPrime(n);
	        }
	    }
	


