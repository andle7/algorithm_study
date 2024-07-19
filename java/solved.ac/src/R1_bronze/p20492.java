package R1_bronze;

import java.util.Scanner;

public class p20492 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();

		int result1 = N - N*22/100;
		int result2 = N*80/100 + (N - N*80/100) - (N - N*80/100)*22/100;	
		
		System.out.println(result1 + " " + result2);
				
	}
}
