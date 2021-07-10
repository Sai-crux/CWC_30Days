package cwc30;

import java.util.Scanner;

public class Q51 {

    public static void main(String[] args)
    {   
       Scanner scan = new Scanner(System.in);
       System.out.print("Input the number: ");
       int n = scan.nextInt();
       if(n < 0) {
    	   System.out.println("Enter a positive number.");
       } else if (n < 9) {
    	   System.out.println("The next palindrome number is: " + (n+1));
       } else {
    	   int num = n;
    	   int res = 1;
    	   int rev = 0;
    	   int digit = 0;
    	   while(res != 0) {
    		   rev = 0;
    		   digit = 0;
    		   n = ++num;
    		   while(n > 0) {
    			   digit = n % 10;
    			   rev = rev * 10 + digit;
    			   n /= 10;
    		   }
    		   if(rev == num) {
    			   res = 0;
    			   System.out.println("The next palindrome is: " + num);
    		   } else {
    			   res = 1;
    		   }
    	   }
       }
   }
}
