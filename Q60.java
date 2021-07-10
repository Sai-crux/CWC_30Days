package cwc30;
import java.util.Scanner;
public class Q60 {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				 
				 System.out.println("Enter the dimensions of A : ");
				 int rowsA = sc.nextInt();
				 int colsA = sc.nextInt();
				 System.out.println("Enter the dimensions of B : ");
				 int rowsB = sc.nextInt();
				 int colsB = sc.nextInt();
				 
				 if(colsA != rowsB) {
					 System.out.println("These matrices can't be multiplied.");
				 } else {
				 
				 int a[][]= new int[rowsA][colsA];
				 int b[][]= new int[rowsB][colsB];
				 
				 
				 
				 System.out.println("Enter the values of array a: ");
				 
				 for(int i = 0; i<rowsA; i++ ) {
					 for(int j = 0; j<colsA; j++) {
						 a[i][j]= sc.nextInt();
					 }
				 }
					System.out.println("Enter the values of array b: ");
							 
							 for(int i = 0; i<rowsB; i++ ) {
								 for(int j = 0; j<colsB; j++) {
									 b[i][j]= sc.nextInt();
								 }
							 }
							 int c[][] = new int[rowsA][colsB];
							 System.out.println("The resultant matrix is: ");
							 
							 for(int i = 0 ; i<rowsA; i++) {
								 for(int j = 0; j<colsB; j++) {
									 c[i][j] = 0;
									 for(int k = 0 ; k < colsA ; k++) {
										 c[i][j] += a[i][k] * b[k][i]; 
									 }
									 System.out.print(c[i][j] + " ");
									
								 } System.out.println();
							 }
				 }
					 
			}

		}

	


