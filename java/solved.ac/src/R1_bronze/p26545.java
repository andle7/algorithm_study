package R1_bronze;

import java.util.Scanner;

public class p26545 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			int number = in.nextInt();
			sum += number;
		}
		
		System.out.println(sum);
		
	}
}
