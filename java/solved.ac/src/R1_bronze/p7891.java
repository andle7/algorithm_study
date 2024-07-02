package R1_bronze;

import java.util.Scanner;

public class p7891 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int result = 0;
		
		for(int i = 0; i<n; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			
			result = a + b;
			System.out.println(result);
		}
		
		
	}
}
