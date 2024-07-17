package R1_bronze;

import java.util.Scanner;

public class p15232 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int R = in.nextInt();
		int C = in.nextInt();
		
		for(int i=0; i<R; i++) {
			for(int j=0; j<C; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
