package cwc30;

import java.util.Arrays;
import java.util.Scanner;

public class Q41 {
	static boolean sum(int arr[],int n, int m){
		if (n > m)
			return true;


		boolean val[]=new boolean[m];
	
		Arrays.fill(val, false);
	
		for (int i = 0; i < n; i++){
			if (val[0])
				return true;
			boolean temp[] = new boolean[m];
			Arrays.fill(temp, false);
	
			for (int j = 0; j < m; j++){
				if (val[j] == true){
					if (val[(j + arr[i]) % m] == false)
						temp[(j + arr[i]) % m] = true;
				}
			}
	
	
				for (int j = 0; j < m; j++)
						if (temp[j])
							val[j] = true;
				val[arr[i] % m] = true;
		}
	
					return val[0];
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int a = sc.nextInt();
		System.out.println("Enter the number to which sum should be equal to: ");
		int b = sc.nextInt();
		int[] arr = new int[a];
		System.out.println("Enter the elements of the array: ");
		for(int i = 0 ; i < a ; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		if(sum(arr, a, b)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
