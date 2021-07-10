package cwc30;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of queries: ");
		int n = sc.nextInt();
		String s = "";
		String[] ques = new String[n];
		String[] ans = new String[n];
		
		for(int i = 0 ; i < n ; i++) {
			if((i+1) == 1 || (i+1)%10 == 1 && (i+1) > 20) {
				s = "st";
			}else if((i+1) == 2 || (i+1)%10 == 2 && (i+1) > 20) {
				s = "nd";
			}else if((i+1) == 3 || (i+1)%10 == 3 && (i+1) > 20) {
				s = "rd";
			}else {
				s = "th";
			}
			System.out.print("Enter asker’s and coordinator’s name for "+ (i+1) + s +" one: ");
			String q = sc.next();
			ques[i] = q;
			String a = sc.next();
			ans[i] = a;
		}
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("     Asker               Query Solved By");
		System.out.println("     --------            ---------------------");
		
		for(int i = 0; i < n ; i++) {
			System.out.print("      " + ques[i]);
			System.out.print("                    ");
			System.out.println(ans[i]);
		}
		System.out.println("------------------------------------------------------------------------------------");

	}

}
