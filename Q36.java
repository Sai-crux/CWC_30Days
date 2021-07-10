package cwc30;

import java.util.Scanner;

public class Q36 {
	int cat(int n) {
        int sum = 0;
        if (n <= 1) {
            return 1;
        }
        for (int i = 0; i < n; i++){
            sum += cat(i) * cat(n - i - 1);
        }
        return sum;
    }
 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Q36 num = new Q36();
		for(int i = 0 ; i < n ; i++) {
			System.out.print(num.cat(i) + " ");
		}
	}

}
