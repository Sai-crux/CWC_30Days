package cwc30;

public class Q10 {

	public static void main(String[] args) {
		int a = 0 , b = 0 , c = 0;
		int sum = 1000;
		boolean check = false;
		for(a = 1; a < 1000 ; a++) {
			for(b = a+1 ; b < 1000 ; b++) {
				c = 1000 - a - b;
				if(a*a + b*b == c*c) {
					check = true;
					break;
				}
			}
			if(check) {
				System.out.println(a*b*c);
				break;
			}
		}

	}

}
