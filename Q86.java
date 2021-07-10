package cwc30;

public class Q86 {
	
	static boolean checkKap(int n){
		int sq = n * n;
		int temp = sq;
		int count = 0;
		while(temp != 0) {
			count++;
			temp /= 10;
		}
		
		for(int i = 1 ; i <= count ; i++) {
			int par = (int)(Math.pow(10, i));
			
			if(par == n) {
				continue;
			}
			
			int sum = sq/par + sq%par;
			if(sum == n) 
				return true;
			
		}
		
		return false;
		
		
	}

	public static void main(String[] args) {
		
		for(int i = 1 ; i <= 1000 ; i++) {
			if(checkKap(i)) 
				System.out.println(i + " ");
			
		}
		
	}

}
