package cwc30;

import java.util.Scanner;

public class Q12 {
    static char change(char a)
    {
        if(a == '0') {
        	return '1';
        } else {
        	return '0';
        }
    }
    static void twos(String dig)
    {
        int n = dig.length();
        int i;
 
        String flip = "";
        String twos = "";
        flip = twos = "";
        for (i = 0; i < n; i++)
        {
            flip += change(dig.charAt(i));
        }
        twos = flip;
        for (i = n - 1; i >= 0; i--)
        {
            if (flip.charAt(i) == '1')
            {
                twos = twos.substring(0, i) + '0' + twos.substring(i + 1);
            }
            else
            {
                twos = twos.substring(0, i) + '1' + twos.substring(i + 1);
                break;
            }
        }
        if (i == -1)
        {
            twos = '1' + twos;
        }
        System.out.println("2's complement: " + twos);
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String m = String.format("%4s", Integer.toBinaryString(n)).replace(" ", "0");
		twos(m);

	}

}
