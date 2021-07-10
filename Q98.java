package cwc30;

public class Q98 {
	
	static int factorial(int n){
		if(n == 0 || n == 1) {
			return 1;
		}
		return n*factorial(n-1);
	}

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 10 ; i < 2540161 ; i++) {
			int sumOfDig = 0;
			int num = i;
			while(num > 0) {
				int digit = num%10;
				sumOfDig += factorial(digit);
				num /= 10;
			}
			
			if(sumOfDig == i) {
				sum += i;
			}
		}
		System.out.println("The sum of the numbers is: " + sum);

	}

}
