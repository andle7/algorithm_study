package R1_bronze;

import java.util.Scanner;

public class p2908 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
	
		A = reverse(A);
		B = reverse(B);
		
		if(A > B) {
			System.out.println(A);
		}else {
			System.out.println(B);
		}
		
	}
	
	static int reverse(int N) {
		int tmp = 0;
		for(int i = 3; i>0; i--) {
			tmp += N%10*Math.pow(10,i);
			N /= 10;
			
		}
		
		return tmp/10;
	}
	
}
