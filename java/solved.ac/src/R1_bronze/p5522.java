package R1_bronze;

import java.util.Scanner;

public class p5522 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] N = new int[5];
		int sum = 0;
		
		
		for(int i = 0; i<5; i++) {
			N[i] = in.nextInt();
			sum += N[i];
		}
		
		System.out.println(sum);
	}
}
