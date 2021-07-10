package cwc30;

import java.util.Scanner;

public class Q91 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n= sc.nextLong();
        long temp = n;
        for(int i = 2; i < temp; i++)
        {
        	while(temp % i == 0)
            {                
                temp = temp / i;
            }
        }
        if(temp > 2) {
            System.out.println("The largest prime factor of " + n + " is: " + temp);
        } else {
        	System.out.println("The largest prime factor of " + n + " is: " + 2);
        }
	}

}
