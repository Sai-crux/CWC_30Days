package cwc30;

public class Q92 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 100;
		int sum = 0;
		for(int i = a ; i <= b ; i++) {
			sum += i;
		}
		int pro = (int)(Math.pow(sum, 2));
		
		int sumSq = 0;
		for(int i = a ; i <= b ; i++) {
			sumSq += (int)(Math.pow(i, 2));
		}
		int diff = pro - sumSq;
		System.out.println("The difference of the square of the sum of first 100 natural numbers and the sum of their squares is: " + diff);

	}

}
