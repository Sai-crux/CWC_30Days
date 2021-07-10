package cwc30;

public class Q100 {
	
	static boolean check(int num , int a) {
		int rev = 0;
		int b = num;
		
		while(b > 0) {
			rev = a * rev + b % a;
			b /= a;
		}
		
		return num == rev;
	}

	public static void main(String[] args) {
		int n = 1000000;
		int sum = 0;
		
		for(int i = 1 ; i < n ; i += 2) {
			if(check(i, 10) && check(i, 2)) {
				sum += i;
			}
		}
		System.out.println("The circular primes under 1000000 are: " + sum);

	}

}
