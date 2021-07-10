package cwc30;

import java.util.Scanner;

public class Q89 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0 || n < 0) {
        	System.out.println("Input must be odd and greater than 0");
        } else {

        int[][] magSq = new int[n][n];

        int row = n-1;
        int col = n/2;
        magSq[row][col] = 1;

        for (int i = 2; i <= n*n; i++) {
            if (magSq[(row + 1) % n][(col + 1) % n] == 0) {
                row = (row + 1) % n;
                col = (col + 1) % n;
            }
            else {
                row = (row - 1 + n) % n;
            }
            magSq[row][col] = i;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (magSq[i][j] < 10 || magSq[i][j] < 100 ) { 
                	System.out.print(" ");
                }
                System.out.print(magSq[i][j] + " ");
            }
            System.out.println();
        }
        }

    }
}

	

