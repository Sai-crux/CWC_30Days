package cwc30;

import java.util.HashMap;
import java.util.Scanner;

public class Q58 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Roman Number: ");
		String s = sc.nextLine();
		HashMap<Character, Integer> conv = new HashMap<Character, Integer>();
		conv.put('I', 1);
		conv.put('V', 5);
		conv.put('X', 10);
		conv.put('L', 50);
		conv.put('C', 100);
		conv.put('D', 500);
		conv.put('M', 1000);
		
		int sum = conv.get(s.charAt(s.length()-1));
		for(int i = s.length()-2 ; i >= 0 ; i--) {
			if(conv.get(s.charAt(i)) >= conv.get(s.charAt(i+1))) {
				sum += conv.get(s.charAt(i));
			} else {
				sum -= conv.get(s.charAt(i));
			}
		}
		System.out.println("The integer value of the Roman is: " + sum);
		
		

	}

}
