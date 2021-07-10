package cwc30;

import java.util.Scanner;

public class Q75 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int pro = 1;
		
			while(n > 0) {
				pro *= n;
				n = n-2;
			}
			System.out.println(pro);
		

	}

}
