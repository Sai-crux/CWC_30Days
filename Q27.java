package cwc30;

import java.util.Scanner;

public class Q27 {
	static int sort(int arr[], int size) {
        int j = 0;
        int i;
        for (i = 0; i < size; i++) {
            if (arr[i] <= 0) {
                int temp;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
 
        return j;
    }
 
    static int posMis(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++) {
            int x = Math.abs(arr[i]);
            if (x - 1 < size && arr[x - 1] > 0)
                arr[x - 1] = -arr[x - 1];
        }
        for (i = 0; i < size; i++)
            if (arr[i] > 0)
                return i + 1; 
        return size + 1;
    }
    static int missed(int arr[], int size){
        int side = sort(arr, size);
        int fin[] = new int[size - side];
        int j = 0;
        for (int i = side; i < size; i++) {
            fin[j] = arr[i];
            j++;
        }
        return posMis(fin, j);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0 ; i < n ; i++) {
        	arr[i] = sc.nextInt();
        }
        int posNum = missed(arr, n);
        System.out.println("The first positive missing number is " + posNum);
    }
}
	


